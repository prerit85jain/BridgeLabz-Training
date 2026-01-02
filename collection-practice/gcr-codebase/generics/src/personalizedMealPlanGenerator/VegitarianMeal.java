package personalizedMealPlanGenerator;

class VegetarianMeal implements MealPlan {
    private String mealName;
    private int calories;

    public VegetarianMeal(String mealName, int calories) {
        this.mealName = mealName;
        this.calories = calories;
    }

    @Override
    public String getMealName() {
        return mealName;
    }

    @Override
    public int getCalories() {
        return calories;
    }

    @Override
    public void showMealDetails() {
        System.out.println(mealName + " | Vegetarian | " + calories + " kcal");
    }
}