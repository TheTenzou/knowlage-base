insert(Elem, [H|T1], [H|T2]):-Elem > H, insert(Elem, T1, T2).
insert(Elem, M, [Elem|M]).

sort1([H|T], Sorted):-sort1(T, SortedT), insert(H, SortedT, Sorted).
sort1([],[]).

writelist([]):-!.
writelist([H|T]):-write(H), write(' '),writelist(T).
readlist([],0):-!.
readlist([H|LIST],N):-read(H),N1 is N-1,readlist(LIST,N1).

run:-
    write('size list: '),
    read(Size),
    write('lisr: '),
    readlist(List, Size),
    write('sorted list:'),
    sort1(List,SortedList),
    writelist(SortedList).
