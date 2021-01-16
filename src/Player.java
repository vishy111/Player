
/**
 * 
 * @author vishalkosaraju
 * Player class for football players
 */
public abstract class Player {

	protected String name;
	private boolean defence=true;
	protected DefenceBehavior defenceBehavior;
	protected OffenceBehavior offenceBehavior;
	/**
	 * Creates a player with an indiciated name and sets the Defence and offence Behavior
	 * 
	 */
	public Player(String name)
	{
		this.name=name;
		setDefenceBehavior();
		setOffenceBehavior();
	
	}
	public abstract void setDefenceBehavior();
	
	public abstract void setOffenceBehavior();
	/**
	 * 
	 * String play is representated below
	 */
	public String play()
	{
		if(defence)
			return this.offenceBehavior.play();
		else
			return this.defenceBehavior.play();
		
		//\return null;
	}
	public void turnover()
	{
		this.defence=!this.defence;
	}
}
