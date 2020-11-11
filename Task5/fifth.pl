combinations1([],[]).
combinations1([H|T], [H|T2]):-combinations1(T,T2).
combinations1([_|T], T2):-combinations1(T,T2).
combinations(List, Result):-
    combinations1(List, Result),
    Result = [_,_,_].

in_list([El|_],El).
in_list([_|T],El):-in_list(T,El).

run:-
    tell('C:/Users/Tenzou/Documents/Prolog/sm/Task5/fifth answer.txt'),
    generate_all_words,
    told.

generate_all_words:-
    combinations([a,b,c,d,e,f],List),
    generate_words(List,8,[]).


generate_words(_,0,Word):-
    write_str(Word),nl,!,fail.

generate_words(A,N,Perm):-
    in_list(A,El),
    N1 is N-1,
    generate_words(A,N1,[El|Perm]).


write_str([]):-!.
write_str([H|Tail]):-put(H),write_str(Tail).




