%=======================================================================
%Graph input

read_str(A):-
    get0(X),
    r_str(X,A,[]).

del_1st([_|T],T).

r_str(10,A,A):-!.
r_str(X,A,B):-
    append(B,[X],B1),
    get0(X1),
    r_str(X1,A,B1).



get_graph_edges(V,E):-
    get_V(V),
    write(V),nl,
    get_edges(V,E),
    write(E).

get_V(V):-
    write("Vertexes count: "),
    read(N),
    write("Vertexes: "),nl,
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
    write("Edges count: "),
    read(M),
    get0(_),
    get_edges(V,E,[],M,0).

get_edges(_,E,E,M,M):-!.

get_edges(V,E,Edges,M,Count):-
    get_edge(V,Edge),
    append(Edges,[Edge],E1),
    Count1 is Count+1,
    get_edges(V,E,E1,M,Count1).


check_vertex([V1|_],V1):-!.
check_vertex([_|T],V1):-check_vertex(T,V1).

get_edge(V,[V1,V2, Weight]):-
    write("Edge: "),nl,
    read_str(X),
    name(V1,X),
    check_vertex(V,V1),
    read_str(Y),
    name(V2,Y),
    check_vertex(V,V2),
    write("weight: "),
    read(Weight),get0(_).

%=======================================================================
%Computation

insert(X,[],[X]).

insert([X1,X2,R1],
       [[Y1,Y2,R2]|L],
       [[X1,X2,R1]|[[Y1,Y2,R2]|L]]):- R1<R2,!.

insert(X,[Y|L1],[Y|L2]):- insert(X,L1,L2).


sort_edges([],Y,Y).

sort_edges([X|L],Y1,Y3):- insert(X,Y1,Y2), sort_edges(L,Y2,Y3).


search(X1,X2,Y,_):- member([X1,X2],Y).

search(X1,X2,Y,_):- member([X2,X1],Y).

search(X1,X2,Y,Z):-
    member([X1,X3],Y),
    not(member(X3,Z)),
    search(X3,X2,Y,[X3|Z]).

search(X1,X2,Y,Z):-
    member([X3,X1],Y),
    not(member(X3,Z)),
    search(X3,X2,Y,[X3|Z]).


minimum_tree([],Z,Z):- !.

minimum_tree([[X1,X2,_]|Y],Z1,Z2):-
    not(search(X1,X2,Z1,[X1])),!,
    minimum_tree(Y,[[X1,X2]|Z1],Z2).

minimum_tree([_|Y],Z1,Z2):- minimum_tree(Y,Z1,Z2).


all_vertexes(_,[],_).
all_vertexes(X,[Y|L],Z):-
    search(X,Y,Z,[X]),!,
    all_vertexes(X,L,Z).


kruskal([X|L],Y,Z):-
    sort_edges(Y,[],Y1),
    minimum_tree(Y1,[],Z),
    all_vertexes(X,L,Z).

%=======================================================================
%run

run:-
    get_graph_edges(V,E),
    kruskal(V,E,Z),
    nl,write("Minimum tree:"),nl,
    write(Z).





















