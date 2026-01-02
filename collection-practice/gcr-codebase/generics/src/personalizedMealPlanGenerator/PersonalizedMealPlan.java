package personalizedMealPlanGenerator;

public class PersonalizedMealPlan {
    public static void main(String[] args) {

        Meal<VegetarianMeal> vegMeals = new Meal<>();
        vegMeals.addMeal(new VegetarianMeal("Paneer Tikka", 250));
        vegMeals.addMeal(new VegetarianMeal("Veg Salad", 120));


        Meal<VeganMeal> veganMeals = new Meal<>();
        veganMeals.addMeal(new VeganMeal("Vegan Buddha Bowl", 300));
        veganMeals.addMeal(new VeganMeal("Tofu Stir Fry", 220));


        Meal<KetoMeal> ketoMeals = new Meal<>();
        ketoMeals.addMeal(new KetoMeal("Keto Chicken", 400));
        ketoMeals.addMeal(new KetoMeal("Avocado Salad", 180));


        Meal<HighProteinMeal> proteinMeals = new Meal<>();
        proteinMeals.addMeal(new HighProteinMeal("Grilled Chicken Breast", 350));
        proteinMeals.addMeal(new HighProteinMeal("Protein Shake", 200));


        System.out.println("--- Vegetarian Meals ---");
        vegMeals.showMeals();

        System.out.println("\n--- Vegan Meals ---");
        veganMeals.showMeals();

        System.out.println("\n--- Keto Meals ---");
        ketoMeals.showMeals();

        System.out.println("\n--- High-Protein Meals ---");
        proteinMeals.showMeals();


        System.out.println("\n### Personalized Meal Plans ###");
        MealPlanGenerator.generatePersonalizedPlan(vegMeals.getMealList(), 300);
        MealPlanGenerator.generatePersonalizedPlan(veganMeals.getMealList(), 400);
        MealPlanGenerator.generatePersonalizedPlan(ketoMeals.getMealList(), 500);
        MealPlanGenerator.generatePersonalizedPlan(proteinMeals.getMealList(), 450);
    }
}