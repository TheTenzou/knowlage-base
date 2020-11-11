% a=97,....
% z=122
% A=65,....
% Z=90
read_str(A,N,Flag):-
    get0(X),
    r_str(X,A,[],N,0,Flag).

r_str(-1,A,A,N,N,1):-!.

r_str(10,A,A,N,N,0):-!.

r_str(X,A,B,N,K,Flag):-
    K1 is K+1,
    append(B,[X],B1),
    get0(X1),
    r_str(X1,A,B1,N,K1,Flag).



read_list_str(List):-
    read_str(A,_,Flag),
    read_list_str([A],List,Flag).

read_list_str(List,List,1):-!.

read_list_str(Cur_list,List,0):-
    read_str(A,_,Flag),
    append(Cur_list,[A],C_l),
    read_list_str(C_l,List,Flag).



write_str([]):-!.

write_str([H|Tail]):-
    put(H),
    write_str(Tail).



write_list_str([]):-!.

write_list_str([H|T]):-
    write_str(H),nl,
    write_list_str(T).


% a=97,....
% z=122
% A=65,....
% Z=90
shift_char(Old_char,
           Shift_size,
           New_char
          ):-
    Old_char >= 97,
    Old_char =< 122 - Shift_size,
    New_char is Old_char + Shift_size.

shift_char(Old_char,
           Shift_size,
           New_char
          ):-
    Old_char >= 65,
    Old_char =< 90 - Shift_size,
    New_char is Old_char + Shift_size.

shift_char(Old_char,
           Shift_size,
           New_char
          ):-
    Old_char > 90 - Shift_size,
    Old_char =< 90,
    Old_char < 97,
    New_char is Old_char + Shift_size - 26.

shift_char(Old_char,
           Shift_size,
           New_char
          ):-
    Old_char > 122 - Shift_size,
    Old_char =< 122,
    New_char is Old_char + Shift_size - 26.



shift_str(Str,
          Shift_size,
          Result
         ):-
    shift_str(Str, Shift_size, [], Result).

shift_str([First_char|Rest_chars],
          Shift_size,
          Temp_str,
          Result_str
         ):-
   shift_char(First_char, Shift_size, New_char),
   append(Temp_str, [New_char], New_temp_str),
   shift_str(Rest_chars, Shift_size, New_temp_str, Result_str).

shift_str([], _, Result, Result):-!.



shift_list(List,
           Shift_size,
           Result_list
          ):-
    shift_list(List, Shift_size, [], Result_list).

shift_list([Line|Rest_lines],
           Shift_size,
           Temp_list,
           Result_list
          ):-
    shift_str(Line, Shift_size, New_line),
    append(Temp_list, [New_line], New_temp_list),
    shift_list(Rest_lines, Shift_size, New_temp_list, Result_list).

shift_list([], _, Result, Result):-!.


do_all_shifts(List):-
    do_all_shifts(List, 1).

do_all_shifts(List, Shift_size):-
    Shift_size < 26,
    shift_list(List, Shift_size, Result_list),
    write_list_str(Result_list),
    writeln('========================================================'),
    New_shift_size is Shift_size + 1,
    do_all_shifts(List, New_shift_size).

do_all_shifts(_,Shift_size):-Shift_size >= 26.

run:-
    see('C:/Users/Tenzou/Documents/Prolog/sm/Task3/third test read.txt'),
    read_list_str(List),
    seen,
    % shift_list(List,1,Res),
    tell('C:/Users/Tenzou/Documents/Prolog/sm/Task3/third test write.txt'),
    %write_list_str(List),
    % writeln(List),
    % write_list_str(Res),
    do_all_shifts(List),
    told.












