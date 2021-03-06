combinations1([],[]).
combinations1([H|T], [H|T2]):-combinations1(T,T2).
combinations1([_|T], T2):-combinations1(T,T2).
combinations(List, Result):-combinations1(List, Result), Result \= [].

in_list([El|_],El):-true,!.
in_list([_|T],El):-in_list(T,El).

condition1(List):-
    (in_list(List, andrey), in_list(List, dmitriy) ->
    not(in_list(List, boris)); true).

condition1_1(List):-
    (not(in_list(List, dmitriy)) ->
    in_list(List, boris),
    not(in_list(List, viktor));
    true).

not_together(List, P1, P2):-
    in_list(List, P1),
    not(in_list(List, P2)).

not_together(List, P1, P2):-
    in_list(List, P2),
    not(in_list(List, P1)).

not_together(List, P1, P2):-
    not(in_list(List, P1)),
    not(in_list(List, P2)).

condition4(List):-
    (not(in_list(List, boris)), not(in_list(List, viktor)) ->
    in_list(List, dmitriy); true).

condition4_1(List):-
    (in_list(List, viktor) ->
    not(in_list(List, dmitriy)),
    in_list(List, grigoriy);
     true).

run:-
    combinations([andrey, dmitriy, boris, viktor, grigoriy], List),
    condition1(List),
    condition1_1(List),
    not_together(List, viktor, andrey),
    not_together(List, dmitriy, grigoriy),
    condition4(List),
    condition4_1(List),
    writeln(List),
    fail.























