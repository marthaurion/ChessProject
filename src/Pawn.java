
public class Pawn implements Piece {
	private PieceColor color;
	private Square location;
	
	public Pawn(int x, int y, PieceColor c) {
		color = c;
		location = new Square(x, y);
	}
	
	public Square getLocation() {
		return location;
	}
	
	public void setLocation(Square s) {
		location = s;
	}
	
	public String getNotation() {
		return location.getNotation();
	}
	
    public int getValue() {
    	return 1;
    }
    
    public String getName() {
    	return "Pawn";
    }
    
    //pawns have no character code in algebraic notation
    public char getID() {
    	return ' ';
    }
    
    public PieceColor getColor() {
    	return color;
    }
    
    public boolean acceptVisitor(PieceVisitor p, Move m) {
    	return p.visitPawn(m, this);
    }
    
    
    //these two methods are specific only to the pawn
    public int advance() {
    	if(color == PieceColor.White) {
    		return 1;
    	}
    	else return -1;
    }
    
    public int start() {
    	if(color == PieceColor.White){
    		return 1;
    	}
    	else return 6;
    }
}
