package ru.thethenzou;

import org.jpl7.*;
import org.jpl7.Integer;

import java.util.Map;


public class Test {
    public static void main(String[] args) {
        JPL.init();
        String s = "consult('E:/My_Progs/knowlage-base/Task8-Akinator-with-interface/src/main/prolog/akinator.pl')";
        Query q1 = new Query(s);
        System.out.println(q1.hasSolution());
        Query q2 = new Query("load");
        System.out.println(q2.hasSolution());
        Variable X = new Variable("X");
        Query q3 = new Query("q1", new Term[] {X,new Integer(1)});
        Map<String, Term>[] solutions = q3.allSolutions();
        for (Map<String, Term> solution : solutions) {
            System.out.println(solution.get("X"));
        }
//        System.out.println(q3.oneSolution().get("X"));
    }
}
