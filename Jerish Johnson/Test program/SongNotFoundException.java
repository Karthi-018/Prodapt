class SongNotFoundException extends Exception{
	SongNotFoundException(String name){
		System.out.println("Song not found in the list");
	}
}