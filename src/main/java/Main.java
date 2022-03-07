public class Main {
    public static void main(String[] args) {

        // true-зелёный false-красный
        boolean itsGreenLight = true;

        //игроки
        int speedOfPlayer1 = 5;
        int speedOfPlayer2 = 0;
        int speedOfPlayer3 = 2;

        // кол-во выбывших
        int count = 0;

        //Создаем массив игроков (собираем их в кучку чтобы можно было их перечислить)
        int players[] = {speedOfPlayer1, speedOfPlayer2, speedOfPlayer3};

        // если горит красный
        if (itsGreenLight == false) {
            // перебираем игроков
            for (int i = 0; i < 3; i++) {
                //если скорость игрока не 0 то count увеличивается на 1
                if (players[i] != 0) count++;
            }
            System.out.println("Горит красный, выбывает " + count + " игроков");
        }
        // если не красный (значит горит зелёный)
        else {
            for (int i = 0; i < 3; i++) {
                //если скорость игрока равна 0 то count увеличивается на 1
                if (players[i] == 0) count++;
            }
            System.out.println("Горит зелёный, выбывает " + count + " игроков");
        }

    }
}
