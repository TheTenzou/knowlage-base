insert(Elem, [H|T1], [H|T2]):-Elem > H, insert(Elem, T1, T2).
insert(Elem, M, [Elem|M]).
