pentNumber(N,P):-P is N*(3*N-1)/2.

isPentNumber(PNum,N):-pentNumber(N,PNum).
isPentNumber(PNum,N):-pentNumber(N,X), X< PNum, N1 is N+1, isPentNumber(PNum,N1).
isPentNumber(PNum):-isPentNumber(PNum,1).

