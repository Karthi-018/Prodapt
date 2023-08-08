class SongNotFoundException extends Exception{
    SongNotFoundException(String n){
        System.out.println("Song is not present in the list");
    }
}