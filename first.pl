pentNumber(N,P):-P is N*(3*N-1)/2.

isPentNumber(PNum,N):-pentNumber(N,PNum).
isPentNumber(PNum,N):-pentNumber(N,X), X<PNum, N1 is N+1, isPentNumber(PNum,N1).
isPentNumber(PNum):-isPentNumber(PNum,1).

check(P1,P2):-R is P2-P1,S is P1+P2, isPentNumber(R), isPentNumber(S), write(P1),
    write(' '), writeln(P2).
check(_,_):-true.

run:-run(1,2).
run(I,J):-pentNumber(J,P),P>1000000,Inext is I+1,Js is Inext+1, run(Inext,Js).
run(I,J):-pentNumber(I,P1), pentNumber(J,P2),P1<1000000,P2<10000000, check(P1,P2),
    Jnext is J+1, run(I,Jnext).


