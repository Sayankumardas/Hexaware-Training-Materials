package com.example.custom.cue;

public class Retention {
	
	private Cue cue = null;
	
	
	public Retention(Cue cue) {
		this.cue = cue;
	}
	
	private String checkCue(int p) throws CueException {
		
		if(!this.cue.retain) { //when retain is false
			//throw exception
			throw new CueException("Cue not retained");
		}
		else if(p<this.cue.pieces) {
			//throw exception
			throw new CueException("More pieces required");
		}
		else if(p>this.cue.pieces) {
			//throw exception
			throw new CueException("Update Required");
		}
		else {
			return "Cue Updated";
		}
		
	}
	
	
	public String playGame(int p) {
		
		try {
			this.checkCue(p);
			return "Welcome to the game";
		}
		catch(CueException e) {
			return "Cannot use this cue";
		}
		catch(Exception e) {
			return "Other Exception";
		}
	}

}
