package personalizedMealPlanGenerator;

import java.util.List;

class MealPlanGenerator {
    public static <T extends MealPlan> void generatePersonalizedPlan(List<T> meals, int maxCalories) {
        System.out.println("=== Personalized Meal Plan (Max " + maxCalories + " kcal) ===");
        int totalCalories = 0;
        for (T meal : meals) {
            if (totalCalories + meal.getCalories() <= maxCalories) {
                meal.showMealDetails();
                totalCalories += meal.getCalories();
            }
        }
        System.out.println("Total Calories: " + totalCalories + " kcal\n");
    }
}