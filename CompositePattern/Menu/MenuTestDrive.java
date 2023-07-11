package DesignPattern.CompositePattern.Menu;

public class MenuTestDrive {
    
    static MenuComponent allMenus = new Menu("ALL MENUS", "All Menus Combined");
    public static void main(String []args) {

        populateMenu();
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();

    }

    public static void populateMenu() {
        MenuComponent pancakeHouseMenu = new Menu("PANCAKE HOUSE MENU ", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent dessartMenu = new Menu("DESSART MENU", "Dessert of course");

        

        allMenus.add(pancakeHouseMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        dinerMenu.add(new MenuItem(
            "Pasta",
            "Spaghetti with Marinara Sauce, and a slice of sourdough bread",
            true,
            3.89));

        dessartMenu.add(new MenuItem("Apple Pie",
            "Apple pie with a flanky crust, topped with vanilla ice cream",
            true,
            1.59));
        
        cafeMenu.add(new MenuItem("Veggie Burger and Air Fries"
        ,"Veggie burger on a whole wheat bun",
        true,
        3.99));

        cafeMenu.add(new MenuItem("Soup of the day",
        "A cup of the soup of the day, with a side salad",
        false,
        3.69));

        cafeMenu.add(new MenuItem("Burrito",
        "A large burrito, with whole pinto beans, salsa, guacamole",
        true,
        4.29));

        dinerMenu.add(new MenuItem("Vegetarian BLT",
        "(Fakin) Bacon with lettuce & tomato on whole wheat",
        true,
        2.99));

        dinerMenu.add(new MenuItem("BLT",
        "Bacon with lettuce & tomato on whole wheat",
        false,
        2.99));

        dinerMenu.add(new MenuItem("Soup of the day",
        "Soup of the day, with a side of potato salad",
        false,
        3.29));

        dinerMenu.add(new MenuItem("Hotdog",
        "A hot dog, with sauerkraut, relish, onions, topped with cheese",
        false,
        3.05));
        
        dinerMenu.add(dessartMenu);
        
        pancakeHouseMenu.add(new MenuItem("K&B's Pancake Breakfast",
            "Pancakes with scrambled eggs and sauce",
            true,
            2.99 ));

        pancakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast",
            "Pancakes with fried eggs, and sausage",
            false,
            2.99));

        pancakeHouseMenu.add(new MenuItem("Blueberry Pancakes",
            "Pancakes made with fresh blueberries",
            true,
            3.49));

        pancakeHouseMenu.add(new MenuItem("Waffles",
            "Waffles with your choice of blueberries and strawberries",
            true,
            3.59));
    }

}
