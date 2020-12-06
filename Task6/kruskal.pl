read_str(A):-
    get0(X),
    r_str(X,A,[]).

del_1st([H|T],T).

r_str(10,A,A):-!.
r_str(X,A,B):-
    append(B,[X],B1),
    get0(X1),
    r_str(X1,A,B1).



get_graph_edges(V,E):-
    get_V(V),
    write(V),nl,
    write("Edges"),ln,
    get_edges(V,E),
    write(E).

get_V(V):-
    read(N),
    write("Vertexes"),nl,
    N1 is N+1,
    get_V(V1,N1),
    del_1st(V1,V).

get_V([],0):-!.

get_V([H|T],N):-
    read_str(X),
    name(H,X),
    N1 is N-1,
    get_V(T,N1).

get_edges(V,E):-
    read(M),
    get0(_),
    get_edges(V,E,[],M,0).

get_edges(V,E,E,M,M):-!.

get_edges(V,E,Edges,M,Count):-
    get_edge(V,Edge),
    append(Edges,[Edge],E1),
    Count1 is Count+1,
    get_edges(V,E,E1,M,Count1).


check_vertex([V1|_],V1):-!.
check_vertex([_|T],V1):-check_vertex(T,V1).

get_edge(V,[V1,V2]):-
    write("Edge"),nl,
    read_str(X),
    name(V1,X),
    check_vertex(V,V1),
    read_str(Y),
    name(V2,Y),
    check_vertex(V,V2).

