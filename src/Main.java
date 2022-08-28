public class Main {
    public static void main (String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }
    private static void task1() {
    }
    static { //задание1
        byte number1 = 3;
        short number2 = 378;
        int number3 = 378378378;
        long number4 = 575678809;
        float number5 = 8.6677f;
        double number6 = 8.668888;
        char number7 = 35;
        boolean number8 = 8>10;
        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(number5);
        System.out.println(number6);
        System.out.println(number7);
        System.out.println(number8);
    }
    private static void task2() {
    } static { //задание 2
        float number1=27.12f;
        long number2=987678965549l;
        byte number3=2;
        short number4=786;
        boolean number5=7<3;
        short number6=569;
        short number7=-159;
        short number8=27897;
        byte number9=67;

    }
private static void task3() {
} static { //задание 3
        short class1=23;
        short class2=27;
        short class3=30;
        short totalPaper=480;
        int paperForChildren= 480/(class1+class2+class3);
        System.out.println();
        System.out.println("На каждого ученика рассчитано " + paperForChildren + " листов" );
    }
 private static void task4() {
}  static { //задание 4
        int timeMin = 2;
        int bottlePiece = 16;
        int capacityOfMachinemin = (bottlePiece / timeMin);
        System.out.println();
        System.out.println("Машина делает бутылок в минуту " + capacityOfMachinemin + " шт");
        int capacityOfMachine20min=capacityOfMachinemin*20;
        System.out.println("Машина делает бутылок за 20 минут " + capacityOfMachine20min + " шт");
        int minutesAday=24*60;
        int capacityOfMachineDay=capacityOfMachinemin*minutesAday;
        System.out.println("Машина делает бутылок за 1 день " + capacityOfMachineDay + " шт");
        int capacityOfMachine3day=capacityOfMachineDay*3;
        System.out.println("Машина делает бутылок за 3 дня " + capacityOfMachine3day+ " шт");
        int capacityOfMachine30day=capacityOfMachineDay*30;
        System.out.println("Машина делает бутылок за 30 дней " + capacityOfMachine30day + " шт");


    }
    private static void task5() {
    } static { //задание 5
        int totalCanOfPaint=120;
        int canForClassWhite=2;
        int canForClassBrown=4;
        int totalCanForClass=canForClassBrown+canForClassWhite;
        int classAtSchool=120/totalCanForClass;
        int canForSchoolWhite=canForClassWhite*classAtSchool;
        int canForSchoolBrown=canForClassBrown*classAtSchool;
        System.out.println();
        System.out.println("В школе где " + classAtSchool+ " классов, потребуется " + canForSchoolWhite+
                " банок с белой краской и "+ canForSchoolBrown+ " банок с коричневой краской" );
    }

  private static void task6() {
    }
   static { //задание 6
         int weightOfBananas=80*5;
         int weightOfMilk=105*2;
         int weightOfIcecream=100*2;
         int weightOfEggs=70*4;
         int totalWeight=weightOfBananas+weightOfMilk+weightOfIcecream+weightOfEggs;
         int totalWeightKg=totalWeight/1000;
       System.out.println();
       System.out.println("Общий вес всех продуктов рецепта равен "+ totalWeightKg+ " кг");

    }
    private static void task7() {
    } static { //задание 7
         int loseWeightGram= 7*1000;
         int loseWeightMinGramDay=250;
        int loseWeightMaxGramDay=500;
        int loseWeightMinGram=loseWeightGram/loseWeightMinGramDay;
        int loseWeightMax=loseWeightGram/loseWeightMaxGramDay;
        float averageTimeLoseWeight=(loseWeightMinGram+loseWeightMax)/2;
        System.out.println();
        System.out.println("При максимальной потере веса в 500 грамм спортсмен похудеет на 7 кг за " +
                loseWeightMax +  " дней,а при минимальной потере в 250 грамм за " + loseWeightMinGram+ " дней.Среднее время похудения спортсмена на 7 кг составит "
                + (int)averageTimeLoseWeight + " день.");
    }
   private static void task8() {}
    static { //задание 8
        int salaryMasha=67760;
        int salaryDenis=83690;
        int salaryKristina=76230;
        float percentSalary=0.1f;
        float Masha10Percent=salaryMasha*percentSalary+salaryMasha;
        float Denis10Percent=salaryDenis*percentSalary+salaryDenis;
        float Kristina10Percent=salaryKristina*percentSalary+salaryKristina;
        System.out.println();
        System.out.println("Маша будет получать после повышения "+ Masha10Percent+ " руб");
        System.out.println("Денис будет получать после повышения "+ Denis10Percent+ " руб");
        System.out.println("Кристина будет получать после повышения "+ Kristina10Percent+ " руб");
        float salaryMashaYear=salaryMasha*12;
        float salaryDenisYear=salaryDenis*12;
        float salaryKristinaYear=salaryKristina*12;
        float salaryMashaYearPercent=Masha10Percent*12;
        float salaryDenisYearPercent=Denis10Percent*12;
        float salaryKristinaYearPercent=Kristina10Percent*12;
        float differenceMasha = (salaryMashaYear-salaryMashaYearPercent);
        float differenceDenis = (salaryDenisYear-salaryDenisYearPercent);
        float differenceKristina = (salaryMashaYear-salaryKristinaYearPercent);
        System.out.println();
        System.out.println("Разница между годовым доходом Маши "+ Math.abs(differenceMasha)+ " руб");
        System.out.println("Разница между годовым доходом Дениса "+ Math.abs(differenceDenis)+ " руб");
        System.out.println("Разница между годовым доходом Кристины "+ Math.abs(differenceKristina)+ "  руб");






    }
}




