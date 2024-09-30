import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The world our hero lives in 
 * 
 * @author Yan
 * @version Sept 2024
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel;
    
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1,false);
        
        // Create the elephant object 
        Elephant elephant = new Elephant();
        addObject(elephant, 300, 300);
        
        // Create label
        scoreLabel = new Label(0,80);
        addObject(scoreLabel,50,50);
        
        spawnFood();
        
    }
    
    /**
     * End the game and draw 'GameOver' 
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over" ,100);
        addObject(gameOverLabel,300,200);
    }
    
    /**
     * Increase Score
     */
    public void increaseScore(int value)
    {
        score += value;
        scoreLabel.setValue(score);
    }
    
    public void spawnFood() {
        int rand = Greenfoot.getRandomNumber(2);
        Food food;
        if(rand == 0) {
            food = new Apple();
        } else {
            food = new Banana();
        }
        int x = Greenfoot.getRandomNumber(600);
        addObject(food, x, 0);
    }
    
    // /**
     // * Create a new apple at random location at top of screen
     // */
    // public void createApple()
    // {
        // Apple apple = new Apple();
        // apple.setSpeed(level);
        // int x = Greenfoot.getRandomNumber(600);
        // int y = 0;
        // addObject(apple,x,y);    
    // }
    
    
}
