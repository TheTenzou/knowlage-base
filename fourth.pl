combinations([],[]).
combinations([H|T], [H|T2]):-combinations(T,T2).
combinations([_|T], T2):-combinations(T,T2).
























