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


shift_char(Old_char,
           Shift_size,
           New_char
          ):-



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



run:-
    see('C:/Users/Tenzou/Documents/Prolog/sm/third test read.txt'),
    read_list_str(List),
    seen,
    tell('C:/Users/Tenzou/Documents/Prolog/sm/third test write.txt'),
    write_list_str(List).
    told.


