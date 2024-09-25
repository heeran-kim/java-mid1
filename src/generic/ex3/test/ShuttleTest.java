package generic.ex3.test;

import generic.ex3.test.unit.Marine;
import generic.ex3.test.unit.Zealot;
import generic.ex3.test.unit.Zergling;

// 이름: 마린, HP: 40
// 이름: 저글링, HP: 35
// 이름: 질럿, HP: 100
public class ShuttleTest {
    public static void main(String[] args) {
        Shuttle<Marine> shuttle1 = new Shuttle<>();
        shuttle1.in(new Marine("마린", 40));
        shuttle1.showInfo();
        Shuttle<Zergling> shuttle2 = new Shuttle<>();
        shuttle2.in(new Zergling("저글링", 35));
        shuttle2.showInfo();
        Shuttle<Zealot> shuttle3 = new Shuttle<>();
        shuttle3.in(new Zealot("질럿", 100));
        shuttle3.showInfo();
    }
}
