package com.control;

import java.util.HashMap;


import com.control.QuestionType;
import com.control.ReligionName;

public class QuestionsAndAnswersConverter {
	public static final HashMap<QuestionType, String> questions = new HashMap<QuestionType, String>();

	public static final HashMap<Object, String> answers = new HashMap<Object, String>();
	
	public static final HashMap<ReligionName, String> religions = new HashMap<ReligionName, String>();
	
	static {
		questions.put(QuestionType.CARE_ABOUT_GODS_EXISTENCE, "Czy rozpatrujesz istnienie (lub nie) boga lub bogów?");
		questions.put(QuestionType.NUMBER_OF_GODS_TO_BELIEVE, "W ilu bogów wierzysz?");
		questions.put(QuestionType.HUMAN_FORM_OF_GOD, "Czy bóg jest lub może być człowiekiem?");
		questions.put(QuestionType.CARE_ABOUT_HELL_EXISTENCE, "Czy uznajesz istnienie piekła?");
		questions.put(QuestionType.CARE_ABOUT_HEAVEN_EXISTENCE, "Czy uznajesz istnienie nieba?");
		questions.put(QuestionType.BELIEF_IN_REINCARNATION, "Czy wierzysz w reinkarnację?");
		questions.put(QuestionType.NESSESITY_OF_PRAYER, "Czy uznajesz konieczność modlitwy?");
		questions.put(QuestionType.NESSESITY_OF_MEDITATION, "Czy uznajesz konieczność medytacji?");
		questions.put(QuestionType.ACCEPTANCE_LEVEL_OF_HOMOSEXUALITY, "Jaki jest twój poziom akceptacji homoseksualizmu?");
		questions.put(QuestionType.ACCEPTANCE_LEVEL_OF_ABORTION, "Jaki jest twój poziom akceptacji aborcji?");
		questions.put(QuestionType.ACCEPTANCE_LEVEL_OF_EUTHANASIA, "Jaki jest twój poziom akceptacji eutanazji?");
		questions.put(QuestionType.RESTRICTIONS_OF_SEXUALITY, "");
		questions.put(QuestionType.VIEW_OF_POLYGAMY, "Jaki jest twój pogląd na temat poligamii?");
		questions.put(QuestionType.MANIFESTATION_IN_DOCTRINAL_DIMENSION, "Jak ważna jest dla ciebie manifestacja religii w wymiarze doktrynalnym? (doktryna, wiara, czytanie świętych ksiąg)\n\n"
				+ "1 - nieważna\n4 - bardzo ważna");
		questions.put(QuestionType.MANIFESTATION_BY_RITUALS, "Jak ważne jest dla ciebie manifestowanie religii poprzez czynności religijne takie jak kulty czy rytuały?\n\n"
				+ "1 - nieważna\n4 - bardzo ważna");
		questions.put(QuestionType.SOCIAL_ORGANISATIONAL_SIDE, "Jak duże znaczenie ma dla ciebie sfera społeczno-organizacyjna religii? (wspólnoty religijne i kontakt między nimi, hierarchiczność)\n\n"
				+ "1 - nieważna\n4 - bardzo ważna");
		questions.put(QuestionType.INDIVIDUAL_SPIRITUALITY, "Jak duże znaczenie ma dla ciebie duchowość indywidualna w wyznawanej religii? (modlitwa, mistyka, medytacja)\n\n"
				+ "1 - nieważna\n4 - bardzo ważna");
		questions.put(QuestionType.NUMBER_OF_FOLLOWERS, "Jak duża miałaby być religia, którą chciałbyś wyznawać?");
		questions.put(QuestionType.TIME_OF_EXISTANCE, "Ilu wiekową historię chciałbyś by miała twoja religia?");
		questions.put(QuestionType.PROCEEDINGS_WITH_DEAD, "Jak powinno się według ciebie postępować ze zmarłymi?");
		questions.put(QuestionType.OBLIGATION_OF_PRAYER, "Czy nie przeszkadza ci obowiązek modlitwy kilka razy dziennie?");
		questions.put(QuestionType.PROHIBITION_FOR_ALCOHOL, "Czy zakaz picia alkoholu dyskryminuje  religię w twoich oczach?");
		questions.put(QuestionType.PROHIBITION_FOR_PORK, "Czy zakaz jedzenia wieprzowiny jest dla ciebie akceptowalny?");
		questions.put(QuestionType.NEED_OF_PILGRIMAGE, "Czy uznajesz konieczność pielgrzymki do świętego miejsca religii?");
		questions.put(QuestionType.LACTOVEGETARIAN_DIET, "Czy byłbyś skłonny przestrzegać diety laktowegetariańskiej?");
		questions.put(QuestionType.PROHIBITION_FOR_BEEF, "Czy zakaz jedzenia wołowiny jest dla ciebie akceptowalny?");
		questions.put(QuestionType.CIRCUMCISION, "Czy zgodziłbyś się na obrzezanie swojego dziecka?");
		questions.put(QuestionType.FAST, "Dostosowałbyś się do postu w określonych dniach/okresach roku?");
		questions.put(QuestionType.KOSHER, "");
		questions.put(QuestionType.HOME_ALTAR, "Czy nie przeszkadza ci posiadanie domowego ołtarzyka, przy którym oddaje się cześć bogu?");
		questions.put(QuestionType.NECESSITY_OF_GIFT, "Odpowiadałoby ci w twojej religii składanie bogom drobnych ofiar w postaci produktów żywnościowych np. soli czy ryb?");
		questions.put(QuestionType.ANTHROPOMORPHIC_GODS, "Przystałbyś na wiarę w antropomorficzne bóstwa, które uosabiają siły natury, zamieszkują przedmioty lub są ubóstwianymi przodkami?");
		questions.put(QuestionType.FRUITARIAN_DIET, "Czy potrafiłbyś przestrzegać diety frutariańskiej?");
		
		answers.put(new Boolean(true), "tak");
		answers.put(new Boolean(false), "nie");
		answers.put(new String("one/one"), "Jednego");
		answers.put(new String("one/many"), "Jednego w wielu osobach");
		answers.put(new String("many"), "Wielu");
		answers.put(new String("none"), "Żadnego");
		answers.put(new String("over_1_mld"), "Ponad miliard wyznawców");
		answers.put(new String("over_100_mln"), "Pomiędzy 100 milionami a miliardem wyznawców");
		answers.put(new String("over_10_mln"), "Pomiędzy 10 milionami a 100 milionami wyznawców");
		answers.put(new String("over_1_mln"), "Pomiędzy milionem a 10 milionami wyznawców");
		answers.put(new String("under_1_mln"), "Poniżej miliona wyznawców");
		answers.put(new String("over_30_ages"), "Ponad 30 wieków");
		answers.put(new String("over_15_ages"), "Pomiedzy 15 a 30 wieków");
		answers.put(new String("over_5_ages"), "Pomiędzy 5 a 15 wieków");
		answers.put(new String("under_5_ages"), "Poniżej 5 wieków");
		answers.put(new String("burial"), "Pogrzeb");
		answers.put(new String("cremation"), "Kremacja");
		answers.put(new Integer(1), "1");
		answers.put(new Integer(2), "2");
		answers.put(new Integer(3), "3");
		answers.put(new Integer(4), "4");
		answers.put(new Integer(10), "Zdecydowanie nie akceptuję");
		answers.put(new Integer(11), "Raczej nie akceptuję");
		answers.put(new Integer(12), "Obojętne");
		answers.put(new Integer(13), "Akceptuję");
		
		religions.put(ReligionName.CHRISTIANITY, "CHREŚCIJAŃSTWO");
		religions.put(ReligionName.ISLAM, "ISLAM");
		religions.put(ReligionName.JUDAISM, "JUDAIZM");
		religions.put(ReligionName.BUDDHISM, "BUDDYZM");
		religions.put(ReligionName.HINDUISM, "HINDUIZM");
		religions.put(ReligionName.BAHAISM, "BAHAIZM");
		religions.put(ReligionName.SIKHISM, "SIKHIZM");
		religions.put(ReligionName.JAINISM, "DŻINIZM");
		religions.put(ReligionName.CONFUCIANISM, "KONFUCJANIZM");
		religions.put(ReligionName.TAOISM, "TAOIZM");
		religions.put(ReligionName.SHINTO, "SHINTO");
		religions.put(ReligionName.ZOROASTRIANISM, "ZARATUSZTRIANIZM");
		religions.put(ReligionName.ATHEISM, "ATEIZM");
		
	}
	
	public static String getQuestionString (QuestionType q) {
		return questions.get(q);  
	}
	
	public static String getAnswerString (Object o) {
		return answers.get(o);
	}
	
	public static String getReligionString (ReligionName r) {
		return religions.get(r);
	}
	
}
