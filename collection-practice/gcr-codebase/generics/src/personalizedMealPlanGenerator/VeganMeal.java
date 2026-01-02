package personalizedMealPlanGenerator;

class VeganMeal implements MealPlan {
    private String mealName;
    private int calories;

    public VeganMeal(String mealName, int calories) {
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
        System.out.println(mealName + " | Vegan | " + calories + " kcal");
    }
}