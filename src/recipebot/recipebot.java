/**
 * @author Austin Kelly
 * @since October 13, 2016
*/


package recipebot;

import twitter4j.*;
import twitter4j.auth.AccessToken;

import java.util.ArrayList;
import java.util.Random;

public class recipebot
{

	public static void main(String[] args) throws TwitterException, InterruptedException
	{

		ArrayList<String> recipe = new ArrayList<String>(100);
		recipe.add("Creamy Chicken Alfredo");
		recipe.add("Hot Tomato Soup");
		recipe.add("Vegan Hot Dog");
		recipe.add("Mouth-watering Patty Melt");
		recipe.add("Home-style Chili");
		recipe.add("Double Bacon Cheeseburger");
		recipe.add("Smoky Mac n Cheese");
		recipe.add("Chocolate Cake Pops");
		recipe.add("Duck A l'Orange");
		recipe.add("Asian Chicken Salad");
		recipe.add("Filet Mignon");
		recipe.add("Garlic Shrimp Salad");
		recipe.add("Zesty Breakfast Burrito");
		recipe.add("Four Spice Onion Soup");
		recipe.add("Hot and Sour Soup");
		recipe.add("Deep Fried Lasagna");
		recipe.add("Buffalo Chicken Sandwich");
		recipe.add("Hot French Onion Soup");
		recipe.add("Spicy Mexican Soup");
		recipe.add("Spicy Cabbage Soup");
		recipe.add("Peanut Shrimp");
		recipe.add("Garlic Herb Chicken");
		recipe.add("Vegan Chicken Sandwich");
		recipe.add("Ragin' Cajun Jambalaya");
		recipe.add("Pub Style Burger");
		recipe.add("Creme Brulee French Toast");
		recipe.add("Cajun Seafood Pasta");
		recipe.add("Crab-Stuffed Lobster Tail");
		recipe.add("Raspberry Porkchops");
		recipe.add("Bourbon Pecan Chicken");
		recipe.add("Asian Lemon Beef");
		recipe.add("Baked Dijon Salmon");
		recipe.add("Indian Butter Chicken");
		recipe.add("Chicken Tikki Masala");
		recipe.add("Savory Gnocchi");
		recipe.add("Chicken Cordon Bleu");
		recipe.add("Ginger Glazed Mahi Mahi");
		recipe.add("Creamy Pesto Pasta");
		recipe.add("Sweet and Sour Turkey");
		recipe.add("Savory Pork Tenderloin");
		recipe.add("Zesty Leg of Lamb");
		recipe.add("Pepperoni Biscuits");
		recipe.add("Eggplant Parmesan");
		recipe.add("Chicken Scarpariello");
		recipe.add("Butternut Squash Risotto");
		recipe.add("African Beef Stew");
		recipe.add("Greek Yogurt");
		recipe.add("Lamb Burgers");
		recipe.add("Apple Bacon Sandwich");
		recipe.add("Creamy Turnip Soup");
		recipe.add("Sweet Caramelized Onions");
		recipe.add("Christmas Candy Apples");
		recipe.add("Buttery Eggs Benedict");
		recipe.add("Butterscotch Pie");
		recipe.add("Peanut Brittle");
		recipe.add("Mushroom Soup");
		recipe.add("Chopped Chicken Salad");
		recipe.add("Pickled Brussels Sprouts");
		recipe.add("Irish Boiled Eggs");
		recipe.add("Salt and Pepper Salmon");
		recipe.add("Mac n Cheese Muffins");
		recipe.add("Corn Fritters");
		recipe.add("Apple Turnovers");
		recipe.add("Magic Meatloaf");
		recipe.add("Italian Rice Balls");
		recipe.add("Cheese Muffins");
		recipe.add("Birthday Cupcakes");
		recipe.add("Broccoli Quiche");
		recipe.add("Cheesy Mashed Potatoes");
		recipe.add("Jumbo Mozzarella Sticks");
		recipe.add("Cheese Souffle");
		recipe.add("Sausage Casserole");
		recipe.add("Creamed Eggs on Toast");
		recipe.add("Cheddar Biscuits");
		recipe.add("Cheeseburger Meatloaf");
		recipe.add("Sweet and Sour Ribs");
		recipe.add("Tangy Pizza Chips");
		recipe.add("Yorkshire Pudding");
		recipe.add("Simple Bread Pudding");
		recipe.add("Spaetzle Dumplings");
		recipe.add("Apple Bacon Sandwich");
		recipe.add("Parmesan Shortbread");
		recipe.add("Swedish Pancakes");
		recipe.add("Keylime Pie");
		recipe.add("Grandma's Apple Pie");



		ArrayList<String> measurement = new ArrayList<String>(100);
		measurement.add("cups");
		measurement.add("tbsp ");
		measurement.add("tsp ");
		measurement.add("ml ");
		measurement.add("oz ");
		measurement.add("gallons ");
		measurement.add("fl oz ");
		measurement.add("handfuls ");
		measurement.add("squirts ");
		measurement.add("pinches ");
		measurement.add("boxes ");
		measurement.add("bags ");


		ArrayList<String> measurementnum = new ArrayList<String>(100);
		measurementnum.add("1/2 ");
		measurementnum.add("1/4 ");
		measurementnum.add("1/3 ");
		measurementnum.add("2/3 ");
		measurementnum.add("3/4 ");
		measurementnum.add("2 ");
		measurementnum.add("3 ");
		measurementnum.add("4 ");

		ArrayList<String> ingredients = new ArrayList<String>(500);
		ingredients.add("tomato paste");
		ingredients.add("tomato sauce");
		ingredients.add("white vinegar");
		ingredients.add("apple vinegar");
		ingredients.add("cooking oil");
		ingredients.add("sesame seeds");
		ingredients.add("balsamic vinaigrette");
		ingredients.add("water");
		ingredients.add("gelatin");
		ingredients.add("yogurt");
		ingredients.add("ice");
		ingredients.add("soy sauce");
		ingredients.add("milk");
		ingredients.add("soy milk");
		ingredients.add("olive oil");
		ingredients.add("almond milk");
		ingredients.add("almonds");
		ingredients.add("goat cheese");
		ingredients.add("cottage cheese");
		ingredients.add("vitamin C");
		ingredients.add("fat-free butter");
		ingredients.add("garlic salt");
		ingredients.add("sweet and sour sauce");
		ingredients.add("butter");
		ingredients.add("vanilla extract");
		ingredients.add("cinnamon");
		ingredients.add("chickpeas");
		ingredients.add("basil");
		ingredients.add("chicken broth");
		ingredients.add("sriracha");
		ingredients.add("cheese");
		ingredients.add("shredded cheese");
		ingredients.add("salmon");
		ingredients.add("nutella");
		ingredients.add("cookie butter");
		ingredients.add("cookie dough");
		ingredients.add("ground beef");
		ingredients.add("eggplant");
		ingredients.add("cholula");
		ingredients.add("pepper");
		ingredients.add("salt");
		ingredients.add("paprika");
		ingredients.add("mustard");
		ingredients.add("ketchup");
		ingredients.add("relish");
		ingredients.add("grapefruit");
		ingredients.add("lemon juice");
		ingredients.add("lime juice");
		ingredients.add("cinnamon sugar");
		ingredients.add("sunflower oil");
		ingredients.add("cornstarch");
		ingredients.add("potatoes");
		ingredients.add("hot dog buns");
		ingredients.add("brown sugar");
		ingredients.add("taco seasoning");
		ingredients.add("cashews");
		ingredients.add("carrots");
		ingredients.add("corn");
		ingredients.add("baking soda");
		ingredients.add("fish oil");
		ingredients.add("fish paste");
		ingredients.add("parsley");
		ingredients.add("pretzels");
		ingredients.add("minced onion");
		ingredients.add("cherries");
		ingredients.add("pineapple");
		ingredients.add("water chestnuts");
		ingredients.add("water");
		ingredients.add("cranberries");
		ingredients.add("grapes");
		ingredients.add("italian breadcrumbs");
		ingredients.add("honey");
		ingredients.add("margarine");
		ingredients.add("maple syrup");
		ingredients.add("BBQ sauce");
		ingredients.add("orange sauce");
		ingredients.add("peanut sauce");
		ingredients.add("buffalo sauce");
		ingredients.add("lard");
		ingredients.add("shredded chicken");
		ingredients.add("italian seasoning");
		ingredients.add("sliced chicken");
		ingredients.add("beef strips");
		ingredients.add("tuna");
		ingredients.add("lima beans");
		ingredients.add("black beans");
		ingredients.add("green beans");
		ingredients.add("tofu");
		ingredients.add("spam");
		ingredients.add("sausage");
		ingredients.add("ground turkey");
		ingredients.add("ribs");
		ingredients.add("riblets");
		ingredients.add("egg substitute");
		ingredients.add("beef cuts");
		ingredients.add("ground lamb");
		ingredients.add("diced beef");
		ingredients.add("salami");
		ingredients.add("sardines");
		ingredients.add("anchovies");
		ingredients.add("squid");
		ingredients.add("lobster tails");
		ingredients.add("veal");
		ingredients.add("quail");
		ingredients.add("cream cheese");
		ingredients.add("octopus bits");
		ingredients.add("cow cheese");
		ingredients.add("shrimp");
		ingredients.add("clams");
		ingredients.add("bacon grease");
		ingredients.add("bacon bits");
		ingredients.add("eggs");
		ingredients.add("jalapeños");
		ingredients.add("chili paste");
		ingredients.add("rice");
		ingredients.add("sea salt");
		ingredients.add("brown rice");
		ingredients.add("oats");
		ingredients.add("apricots");
		ingredients.add("cashews");
		ingredients.add("beer");
		ingredients.add("steak seasoning");
		ingredients.add("flour");
		ingredients.add("cornstarch");
		ingredients.add("salsa");
		ingredients.add("diced carrots");
		ingredients.add("peanut butter");

		ArrayList<String> containers = new ArrayList<String>(100);
		containers.add("sauce pan");
		containers.add("pan");
		containers.add("cake pan");
		containers.add("bread pan");
		containers.add("dish");
		containers.add("blender");
		containers.add("skillet");
		containers.add("medium sauce pan");
		containers.add("bowl");
		containers.add("tupperware bowl");
		containers.add("small sauce pan");
		containers.add("cooking sheet");
		containers.add("plate");
		containers.add("cooking pot");

		ArrayList<String> additionalThing = new ArrayList<String>(100);
		additionalThing.add("Let simmer");
		additionalThing.add("Stir with whisk");
		additionalThing.add("Stir with spoon");
		additionalThing.add("Stir with knife");
		additionalThing.add("Blend until even");
		additionalThing.add("Let cool before serving");
		additionalThing.add("Check with toothpick");
		additionalThing.add("Sprinkle with salt");
		additionalThing.add("Sprinkle with pepper");
		additionalThing.add("Sprinkle with breadcrumbs");
		additionalThing.add("Sprinkle with garlic powder");
		additionalThing.add("Brush with butter");
		additionalThing.add("Garnish");
		additionalThing.add("Let settle");
		additionalThing.add("Roll into sausage shape");
		additionalThing.add("Roll into a ball");
		additionalThing.add("Pat down with hand");
		additionalThing.add("Shake in a container until even");
		additionalThing.add("Remove residue");
		additionalThing.add("Let harden");
		additionalThing.add("Knead until even");



		ArrayList<String> time = new ArrayList<String>(100);
		time.add("1 min");
		time.add("2 min");
		time.add("5 min");
		time.add("8 min");
		time.add("10 min");
		time.add("15 min");
		time.add("17 min");
		time.add("25 min");
		time.add("30 min");
		time.add("60 min");
		time.add("90 min");
		time.add("30 sec");
		time.add("10 sec");
		time.add("45 sec");
		time.add("60 sec");

		ArrayList<String> action = new ArrayList<String>(100);
		action.add("Boil");
		action.add("Freeze");
		action.add("Steam");
		action.add("Mash");
		action.add("Dice");
		action.add("Grill");
		action.add("Heat");
		action.add("Grind");
		action.add("Broil");
		action.add("Knead");
		action.add("Let sit");
		action.add("Sear");
		action.add("Deep fry");
		action.add("Toast");
		action.add("Roast");
		action.add("Microwave");
		action.add("Bake at 300°");
		action.add("Bake at 340°");
		action.add("Bake at 350°");
		action.add("Bake at 355°");
		action.add("Bake at 400°");
		action.add("Bake at 415°");
		action.add("Roast");
		action.add("Tenderize");
		action.add("Blend");
		action.add("Baste");
		action.add("Refrigerate");





		//access the twitter API using your twitter4j.properties file
        Twitter twitter = TwitterFactory.getSingleton();

        //send a tweet
        while (true)
        {
    		String ing1 =  getIngredient(measurementnum, measurement, ingredients);
    		String ing2 =  getIngredient(measurementnum, measurement, ingredients);
    		String ing3 =  getIngredient(measurementnum, measurement, ingredients);
			boolean inRange = false;
			String currentRecipe = (getRand(recipe));
			String update = "";
			while (inRange==false)
			{
				String finalString = (currentRecipe+": Add "+ing1+", "+ing2+" & "+ing3+" to a "+getRand(containers)+". "+getEnd(action,time,additionalThing)+" and enjoy!");
				if (finalString.length()<=139)
					{
					update = finalString;
					inRange = true;
					}
				else
					inRange = false;
			}
	        Status status = twitter.updateStatus(update);
	        System.out.println("Tweet succeeded");
	        System.out.printf(update);
			Thread.sleep(7200000); //2 hours
	        //Thread.sleep(60*60*1000);

        }
	}


	public static String getRand(ArrayList<String> x)
	{
		int randomNumber = 0;
		Random r = new Random();
		do
		{
		  randomNumber = r.nextInt(x.size());
		}
		while(randomNumber == 0);

		String randitem = x.get(randomNumber);
		return (randitem);
	}


	public static String getIngredient(ArrayList<String> num, ArrayList<String> meas, ArrayList<String> ing)
	{
		return getRand(num)+getRand(meas)+"of "+getRand(ing);
	}


	public static String getEnd(ArrayList<String> a, ArrayList<String> t, ArrayList<String> x)
	{
		int result;
		Random r = new Random();
		result = r.nextInt(3);
		if (result  == 0)
			{
			return getRand(x);
			}
		else
			return getRand(a)+" for "+getRand(t);

	}
}
