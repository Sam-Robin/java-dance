package Dance;

/**
 * A pupil that
 * @author Sam
 *
 */
public class Pupil {

	private
		String name;
		static int id;
		Costume costume;
		String group;
	
	public Pupil(String name, Costume costume, String group) {
		this.name = name;
		this.costume = costume;
		setId();
		this.group = group;
	}
	
	private void setId() {
		Pupil.id = id + 1;
	}
}
