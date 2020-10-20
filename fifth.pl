combinations1([],[]).
combinations1([H|T], [H|T2]):-combinations1(T,T2).
combinations1([_|T], T2):-combinations1(T,T2).
combinations(List, Result):-combinations1(List, Result), Result \= [].

in_list([El|_],El).
in_list([_|T],El):-in_list(T,El).
