public class Main {
    public static void main(String[] args) {
        System.out.println("задача 1");
        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        System.out.println("задача 2");
        dog+=4;
        System.out.println(dog);
        cat+=4;
        System.out.println(cat);
        paper+=4;
        System.out.println(paper);

        System.out.println( "задача 3");
         var dog1 = 8;
         dog1 -= 3.5;
        System.out.println(dog1);
        var cat1 = 3.6;
        cat1=  cat1 -1.6;
        System.out.println(cat1);
        var paper1 =763789;
        paper1 = paper -=7639;
        System.out.println(paper1);

        System.out.println("задача 4");
        var friend=19;
        friend= friend+2;
        friend = friend/7;
System.out.println(friend);

System.out.println("задача 5");
        var frog =3.5;
        System.out.println(frog);
        frog = frog *10;
        System.out.println(frog);
        frog= frog / 3.5;
        System.out.println(frog);
        frog+=4;
        System.out.println(frog);

        System.out.println("задача 6");
        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeight = boxer1 + boxer2;
        System.out.println("общий вес бойцов " + totalWeight + " кг");
        var difference = boxer2 - boxer1;
        System.out.println( "разница в весе " + difference + " кг");

        System.out.println("задача 7");
        difference = boxer1-boxer2;// первый способ
        System.out.println(difference);
        difference = boxer2 % boxer1;// второй способ
        System.out.println(difference);
        System.out.println("задача 8");

        var workingHours = 640;
        var clockNorm = 8;
        var totalWorkers = workingHours/clockNorm;
        System.out.println("Всего работников в компании – " +totalWorkers +" человек");
        totalWorkers = totalWorkers +94;
        workingHours = totalWorkers * clockNorm;
        System.out.println("Если в компании работает " + totalWorkers +" человек, то всего " + workingHours +" часов работы может быть поделено между сотрудниками");













    }
}