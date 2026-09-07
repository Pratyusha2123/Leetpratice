public class ArmyBattleWinner {
    public String countryAtWar(int[] arr1, int[] arr2) {
        int winsA = 0;
        int winsB = 0;

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > arr2[i]) {
                winsA++;
            } else if (arr1[i] < arr2[i]) {
                winsB++;
            }
        }

        if (winsA > winsB) {
            return "A";
        } else if (winsB > winsA) {
            return "B";
        } else {
            return "DRAW";
        }
    }

    public static void main(String[] args) {
        ArmyBattleWinner battle = new ArmyBattleWinner();
        int[] arr1 = {2, 2};
        int[] arr2 = {5, 5};
        System.out.println("Output 1: " + battle.countryAtWar(arr1, arr2));
    }
}
