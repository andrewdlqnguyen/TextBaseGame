
/**
 * The starting point for the Zuul Game.
 * 
 * @author Andrew
 * @version 0.1
 */
public class GameMain
{
    /**
     * The starting point for the zuul game.
     * @param args Program arguments.
     */
    public static void main(String[] args)
    {
        if(args.length > 0){
            for(int i = 0; i < 5; i++){
                System.out.println("* \n");
            }
            for(String a : args){
                System.out.println("Hello: " + a);
            }
        }
        Game game = new Game();
        game.play();
    }

}
