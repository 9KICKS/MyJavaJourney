package assignments;

import assignments.studentGrade.Question;

import java.util.Scanner;

public class MBTIPersonalityTest {
    private static int countA = 0;
    private static int countB = 0;
    private static Question[] questions = new Question[20];
    private static String[] answers = new String[20];
    private static Scanner input = new Scanner(System.in);
    private static String userName;
    private static String sectionOne;
    private static String sectionTwo;
    private static String sectionThree;
    private static String sectionFour;
    public static void main(String[] args) {
        System.out.println("What is your name? ");
        userName = input.nextLine();
        System.out.println("MYER-BRIGGS Questionnaire:");
        loadQuestionsIntoArray();
        revealQuestions();
        showUserChoice();
        determinePersonalityType();
    }

    private static void determinePersonalityType() {
        String result = sectionOne + sectionTwo+ sectionThree + sectionFour;
        if (result.equals("ENTJ")) {
            infoOnENTJ();
        } else if (result.equals("ENFJ")) {
            infoOnENFJ();
        } else if (result.equals("ESFJ")) {
            infoOnESFJ();
        } else if (result.equals("ESTJ")) {
            infoOnESTJ();
        } else if (result.equals("ENTP")) {
            infoOnENTP();
        } else if (result.equals("ENFP")) {
            infoOnENFP();
        } else if (result.equals("ESFP")) {
            infoOnESFP();
        } else if (result.equals("ESTP")) {
            infoOnESTP();
        } else if (result.equals("INTP")) {
            infoOnINTP();
        } else if (result.equals("INFP")) {
            infoOnINFP();
        } else if (result.equals("ISFP")) {
            infoOnISFP();
        } else if (result.equals("ISTP")) {
            infoOnISTP();
        } else if (result.equals("INTJ")) {
            infoOnINTJ();
        } else if (result.equals("INFJ")) {
            infoOnINFJ();
        } else if (result.equals("ISFJ")) {
            infoOnISFJ();
        } else if (result.equals("ISTJ")) {
            infoOnISTJ();
        }
    }

    private static void showUserChoice() {
        System.out.println("Hello " + userName + " you selected:");
        showChoiceForSection(1);
        showChoiceForSection(2);
        showChoiceForSection(3);
        showChoiceForSection(4);
    }

    private static void showChoiceForSection(int i) {
        countA = 0;
        countB = 0;
        String answer = "";

        for (int j = i-1; j < questions.length; j+=4) {
            if(answers[j].equals("A")) {
                countA+=1;
                answer = questions[j].getOptionA();
            } else if(answers[j].equals("B")) {
                countB+=1;
                answer = questions[j].getOptionB();
            }
            System.out.println(answer);
        }
        System.out.println("Number of A selected: "+ countA);
        System.out.println("Number of B selected: "+ countB);
        System.out.println();

        if (i == 1 && countA > countB) {
            sectionOne = "E";
        } else if (i == 1 && countB > countA) {
            sectionOne = "I";
        }
        if (i == 2 && countA > countB) {
            sectionTwo = "S";
        } else if (i == 2 && countB > countA) {
            sectionTwo = "N";
        }
        if (i == 3 && countA > countB) {
            sectionThree = "T";
        } else if (i == 3 && countB > countA) {
            sectionThree = "F";
        }
        if (i == 4 && countA > countB) {
            sectionFour = "J";
        } else if (i == 4 && countB > countA) {
            sectionFour = "P";
        }
    }

    private static void revealQuestions() {
        for (int i = 0; i < questions.length; i++) {
            System.out.printf("%6s%s%n",questions[i].getOptionA(),questions[i].getOptionB());
            answers[i] = input.nextLine().toUpperCase();
            while(!(answers[i].equals("A") || answers[i].equals("B")) ){
                System.out.printf("%6s%s%n",questions[i].getOptionA(),questions[i].getOptionB());
                answers[i] = input.nextLine().toUpperCase();
            }
        }
        System.out.println();
    }

    private static void loadQuestionsIntoArray() {
        questions[0] = new Question("A. Expend energy, enjoy groups ", "B. Conserve energy, enjoy one-on-one");
        questions[1] = new Question("A. Interpret literally ", "B. Look for meaning and possibilities");
        questions[2] = new Question("A. Logical, thinking, questioning ", "B. Empathetic, feeling, accommodating");
        questions[3] = new Question("A. Organized, orderly ", "B. Flexible, adaptable");
        questions[4] = new Question("A. More outgoing, think out loud ", "B. More reserved, think to yourself");
        questions[5] = new Question("A. Practical, realistic, experiential ", "B. Imaginative, innovative, theoretical");
        questions[6] = new Question("A. Candid, straight forward, frank ", "B. Tactful, kind, encouraging");
        questions[7] = new Question("A. Plan, schedule ", "B. Unplanned, spontaneous");
        questions[8] = new Question("A. Seek many tasks, public activities, interaction with others ", "B. Seek private, solitary activities with quiet to concentrate");
        questions[9] = new Question("A. Standard, usual, conventional ", "B. Different, novel, unique");
        questions[10] = new Question("A. Firm, tend to criticize, hold the line ", "B. Gentle, tend to appreciate, conciliate");
        questions[11] = new Question("A. Regulated, structured ", "B. Easygoing, 'live' and 'let live'");
        questions[12] = new Question("A. External, communicative, express yourself ", "B. Internal, reticent, keep to yourself");
        questions[13] = new Question("A. Focus on here-and-now ", "B. Look to the future, global perspective, 'big picture'");
        questions[14] = new Question("A. Tough-minded, just ", "B. Tender-hearted, merciful");
        questions[15] = new Question("A. Preparation, plan ahead ", "B. Go with the flow, adapt as you go");
        questions[16] = new Question("A. Active, initiate ", "B. Reflective, deliberate");
        questions[17] = new Question("A. Facts, things, 'what is' ", "B. Ideas, dreams, 'what could be', philosophical");
        questions[18] = new Question("A. Matter of fact, issue-oriented ", "B. Sensitive, people-oriented, compassionate");
        questions[19] = new Question("A. Control, govern ", "B. Latitude, freedom");
    }

    private static void infoOnENTJ() {
        System.out.println("""
                ENTJ
                    The Decisive Strategist (MBTI)
                    The Commander (16Personalities)
                    
                The ENTJ Personality Type:
                 Strategic, logical, efficient, outgoing, ambitious, independent.
                 effective organizers of people and long-range planners.
                 Bold, imaginative and strong-willed leaders, always finding a way - or making one.
                 
                What Does ENTJ Stand For?
                 ENTJ is one of the sixteen personality types created by Katherine Briggs and
                 Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI).
                 ENTJ stands for Extraverted, iNtuitive, Thinking, Judging.
                """);
    }

    private static void infoOnENFJ() {
        System.out.println("""
                ENFJ
                    The Compassionate Facilitator (MBTI)
                    The Protagonist (16Personalities)
                
                The ENFJ Personality Type:
                 Caring, enthusiastic, idealistic, organized, diplomatic, responsible.
                 Skilled communicators who value connection with people.
                 Charismatic and inspiring leaders, able to mesmerize their listeners.
                 
                What Does ENFJ Stand For?
                 ENFJ is one of the sixteen personality types created by Katherine Briggs and
                 Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI).
                 ENFJ stands for Extraverted, iNtuitive, Feeling, Judging.
                """);
    }

    private static void infoOnESFJ() {
        System.out.println("""
                ESFJ
                    The Supportive Contributor (MBTI)
                    The Consul (16Personalities)
                    
                The ESFJ Personality Type:
                 Friendly, outgoing, reliable, conscientious, organized, practical.
                 Seek to be helpful and please others, enjoy being active and productive.
                 Extraordinarily caring, social and popular people, always eager to help.
                 
                What Does ESFJ Stand For?
                 ESFJ is one of the sixteen personality types created by Katherine Briggs and
                 Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI).
                 ESFJ stands for Extraverted, Sensing, Feeling, Judging.
                """);
    }

    private static void infoOnESTJ() {
        System.out.println("""
                ESTJ
                    The Efficient Organizer (MBTI)
                    The Executive (16Personalities)
                    
                The ESTJ Personality Type:
                 Efficient, outgoing, analytical, systematic, dependable, realistic.
                 Like to run the show and get things done in an orderly fashion.
                 Excellent administrators, unsurpassed at managing things - or people.
                
                What Does ESTJ Stand For?
                 ESTJ is one of the sixteen personality types created by Katherine Briggs and
                 Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI).
                 ESTJ stands for Extraverted, Sensing, Thinking, Judging.
                """);
    }

    private static void infoOnENTP() {
        System.out.println("""
                ENTP
                    The Enterprising Explorer (MBTI)
                    The Debater (16Personalities)
                    
                The ENTP Personality Type:
                 Inventive, enthusiastic, strategic, enterprising, inquisitive, versatile.
                 Enjoy new ideas and challenges, value inspiration.
                 Smart and curious thinkers who cannot resist an intellectual challenge.
                 
                What Does ENTP Stand For?
                 ENTP is one of the sixteen personality types created by Katherine Briggs and
                 Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI).
                 ENTP stands for Extraverted, iNtuitive, Thinking, Perceiving.
                """);
    }

    private static void infoOnENFP() {
        System.out.println("""
                ENFP
                    The Imaginative Motivator (MBTI)
                    The Campaigner (16Personalities)
                    
                The ENFP Personality Type:
                 Enthusiastic, creative, spontaneous, optimistic, supportive, playful.
                 Value inspiration, enjoy starting new projects, see potential in others.
                 Enthusiastic, creative and sociable free spirits, who can always find a reason to smile.
                 
                What Does ENFP Stand For?
                 ENFP is one of the sixteen personality types created by Katherine Briggs and
                 Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI).
                 ENFP stands for Extraverted, iNtuitive, Feeling, Perceiving.
                """);
    }

    private static void infoOnESFP() {
        System.out.println("""
                ESFP
                    The Enthusiastic Improvisor (MBTI)
                    The Entertainer (16Personalities)
                    
                The ESFP Personality Type:
                 Playful, enthusiastic, friendly, spontaneous, tactful, flexible.
                 Have strong common sense, enjoy helping people in tangible ways.
                 Spontaneous, energetic and enthusiastic people - life is never boring around them.
                
                What Does ESFP Stand For?
                 ESFP is one of the sixteen personality types created by Katherine Briggs and
                 Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI).
                 ESFP stands for Extraverted, Sensing, Feeling, Perceiving.
                """);
    }

    private static void infoOnESTP() {
        System.out.println("""
                ESTP
                    The Energetic Problem Solver (MBTI)
                    The Entrepreneur (16Personalities)
                
                The ESTP Personality Type:
                 Outgoing, realistic, action-oriented, curious, versatile, spontaneous.
                 Pragmatic problem solvers and skillful negotiators.
                 Smart, energetic and very perceptive people, who truly enjoy living on the edge.
                 
                What Does ESTP Stand For?
                 ESTP is one of the sixteen personality types created by Katherine Briggs and
                 Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI).
                 ESTP stands for Extraverted, Sensing, Thinking, Perceiving.
                """);
    }

    private static void infoOnINTP() {
        System.out.println("""
                INTP
                    The Objective Analyst (MBTI)
                    The Logician (16Personalities)
                    
                The INTP Personality TYpe:
                 Intellectual, logical, precise, reserved, flexible, imaginative.
                 Original thinkers who enjoy speculation and creative problem solving.
                 Innovative inventors with an unquenchable thirst for knowledge.
                
                What Does INTP Stand For?
                 INTP is one of the sixteen personality types created by Katherine Briggs and
                 Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI).
                 INTP stands for Introverted, iNtuitive, Thinking, Perceiving.
                """);
    }

    private static void infoOnINFP() {
        System.out.println("""
                INFP
                    The Thoughtful Idealist (MBTI)
                    The Mediator (16Personalities)
                    
                The INFP Personality Type:
                 Sensitive, creative, idealistic, perceptive, caring, loyal.
                 Value inner harmony and personal growth, focus on dreams and possibilities.
                 Poetic, kind and altruistic people, always eager to help a good cause.
                 
                What Does INFP Stand For?
                 INFP is one of the sixteen personality types created by Katherine Briggs and
                 Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI).
                 INFP stands for Introverted, iNtuitive, Feeling, Perceiving.
                """);
    }

    private static void infoOnISFP() {
        System.out.println("""
                ISFP
                    The Versatile Supporter (MBTI)
                    The Adventurer (16Personalities)
                    
                The ISFP Personality Type:
                 Gentle, sensitive, nurturing, helpful, flexible, realistic.
                 Seek to create a personal environment that is both beautiful and practical.
                 Flexible and charming artists, always ready to explore and experience something new.
                
                What Does ISFP Stand For?
                 ISFP is one of the sixteen personality types created by Katherine Briggs and
                 Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI).
                 ISFP stands for Introverted, Sensing, Feeling, Perceiving.
                 """);
    }

    private static void infoOnISTP() {
        System.out.println("""
                ISTP
                    The Logical Pragmatist (MBTI)
                    The Virtuoso (16Personalities)
                    
                The ISTP Personality Type:
                 Action-oriented, logical, analytical, spontaneous, reserved, independent.
                 Enjoy adventure, skilled at understanding how mechanical things work.
                 Bold and practical experimenters, masters of all kinds of tools.
                
                What Does ISTP Stand For?
                 ISTP is one of the sixteen personality types created by Katherine Briggs and
                 Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI).
                 ISTP stands for Introverted, Sensing, Thinking, Perceiving.
                """);
    }

    private static void infoOnINTJ() {
        System.out.println("""
                INTJ
                    The Conceptual Planner (MBTI)
                    The Architect (16Personalities)
                    
                The INTJ Personality Type:
                 Innovative, independent, strategic, logical, reserved, insightful.
                 Driven by their own original ideas to achieve improvements.
                 Imaginative and strategic thinkers, with a plan for everything.
                 
                What Does INTJ Stand For?
                 INTJ is one of the sixteen personality types created by Katherine Briggs and
                 Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI).
                 INTJ stands for Introverted, iNtuitive, Thinking, Judging.
                """);
    }

    private static void infoOnINFJ() {
        System.out.println("""
                INFJ
                    The Insightful Visionary (MBTI)
                    The Advocate (16Personalities)
                    
                The INFJ Personality Type:
                 Idealistic, organized, insightful, dependable, compassionate, gentle.
                 Seek harmony and cooperation, enjoy intellectual stimulation.
                 Quiet and mystical, yet very inspiring and tireless idealists.
                 
                What Does INFJ Stand For?
                 INFJ is one of the sixteen personality types created by Katherine Briggs and
                 Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI).
                 INFJ stands for Introverted, iNtuitive, Feeling, Judging.
                """);
    }

    private static void infoOnISFJ() {
        System.out.println("""
                ISFJ
                    The Practical Helper (MBTI)
                    The Defender (16Personalities)
                    
                The ISFJ Personality Type:
                 Warm, considerate, gentle, responsible, pragmatic, thorough.
                 Devoted caretakers who enjoy being helpful to others.
                 Very dedicated and warm protectors, always ready to defend their loved ones.
                 
                What Does ISFJ Stand For?
                 ISFJ is one of the sixteen personality types created by Katherine Briggs and
                 Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI).
                 ISFJ stands for Introverted, Sensing, Feeling, Judging.
                """);
    }

    private static void infoOnISTJ() {
        System.out.println("""
                ISTJ
                    The Responsible Realist (MBTI)
                    The Logistician (16Personalities)
                
                The ISTJ Personality Type:
                 Responsible, sincere, analytical, reserved, realistic, systematic.
                 Hardworking and trustworthy with sound practical judgement.
                 Practical and fact-minded individuals, whose reliability cannot be doubted.
                 
                What Does ISTJ Stand For?
                 ISTJ is one of the sixteen personality types created by Katherine Briggs and
                 Isabel Myers, creators of the Myers-Briggs Type Indicator (MBTI).
                 ISTJ stands for Introverted, Sensing, Thinking, Judging.
                """);
    }
}