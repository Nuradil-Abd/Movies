package java15.Commands;

public class Show {
    public static void show1(){
        System.out.println("""
                
                ~~~~~WELCOME!~~~~~
                select mode to start
                1. Find movie
                2. Sort movie
                0. Exit""");
    }
    public static void show2 (){
        System.out.println("""
               
               ~~~~~Find~~~~~
                select actions
                1. Get All Movies
                2. Find movie by name
                3. Find by actor name
                4. Find by year
                5. Find by producer
                6. Find by Genre
                7. Find Role by Actor and Movie
                0. Go to Select mode""");
    }
    public static void show3 (){
        System.out.println("""
                
                ~~~~~~Sort~~~~~
                select actions to sort
                1. Sort Movie by name (asc || desc)
                2. Sort Movie by year (asc || desc)
                3. Sort Movie by Producer (name|| LastName)
                0. Go to select mode""");
    }

}
