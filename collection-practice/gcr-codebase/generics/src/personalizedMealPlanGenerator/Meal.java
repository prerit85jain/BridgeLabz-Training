package personalizedMealPlanGenerator;

import java.util.ArrayList;
import java.util.List;

class Meal<T extends MealPlan> {
    private List<T> mealList = new ArrayList<>();

    public void addMeal(T meal) {
        mealList.add(meal);
    }

    public List<T> getMealList() {
        return mealList;
    }

    public void showMeals() {
        for (T meal : mealList) {
            meal.showMealDetails();
        }
    }
}