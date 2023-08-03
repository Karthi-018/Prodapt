public class Pojo_Quiz {
    String quest;
    char option;
    char ans;

    public Pojo_Quiz(String quest, char option, char ans) {
        this.quest = quest;
        this.option = option;
        this.ans = ans;
    }

    public String getQuest() {
        return quest;
    }

    public void setQuest(String quest) {
        this.quest = quest;
    }

    public char getOption() {
        return option;
    }

    public void setOption(char option) {
        this.option = option;
    }

    public char getAns() {
        return ans;
    }

    public void setAns(char ans) {
        this.ans = ans;
    }

    @Override
    public String toString() {
        return "Pojo_Quiz{" +
                "quest='" + quest + '\n' +
                ", option=" + option +
                ", ans=" + ans +
                '}';
    }
}
