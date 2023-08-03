package org.example.list;

public class QuizMain {
        String questions;
        char crtans;

        public QuizMain(String questions, char crtans) {
            this.questions = questions;
            this.crtans = crtans;
        }

        public String getQuestions() {
            return questions;
        }

        public void setQuestions(String questions) {
            this.questions = questions;
        }

        public char getCrtans() {
            return crtans;
        }

        public void setCrtans(char crtans) {
            this.crtans = crtans;
        }

    @Override
    public String toString() {
        return "QuizMain{" +
                "questions='" + questions + '\'' +
                ", crtans=" + crtans +
                '}';
    }
}



