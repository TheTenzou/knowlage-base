combinations1([],[]).
combinations1([H|T], [H|T2]):-combinations1(T,T2).
combinations1([_|T], T2):-combinations1(T,T2).
combinations(List, Result):-
    combinations1(List, Result),
    Result = [_,_,_].

in_list([El|_],El).
in_list([_|T],El):-in_list(T,El).

run:-
    tell('C:/Users/Tenzou/Documents/Prolog/sm/Task5/fifth answer12.txt'),
    generate_all_words,
    told.

generate_all_words:-
    combinations([a,b,c,d,e,f],List),
    generate_words(List,8,[]).


generate_words(_,0,Word):-
    count_different_elements(Word,X),
    list_length(X,L),
    (   L = 3 ->
    write_str(Word),nl,!,fail; !,fail).

generate_words(A,N,Perm):-
    in_list(A,El),
    N1 is N-1,
    generate_words(A,N1,[El|Perm]).

count_different_elements([H|T], Tmp):-
    in_list(Tmp, H), count_different_elements(T, Tmp).
count_different_elements([], _).

list_length([]     , 0 ).
list_length([_|Xs] , L ) :- list_length(Xs,N) , L is N+1.

getSimbol(Simbol,[Simbol|Rest],Rest).
getSimbol(Simbol,[_,Rest],R):-getSimbol(Simbol,Rest,R).


write_str([]):-!.
write_str([H|Tail]):-put(H),write_str(Tail).






