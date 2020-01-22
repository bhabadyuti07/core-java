/**
 * 
 */
package com.corejava.nlg;

import simplenlg.features.Feature;
import simplenlg.features.Tense;
import simplenlg.framework.CoordinatedPhraseElement;
import simplenlg.framework.NLGElement;
import simplenlg.framework.NLGFactory;
import simplenlg.lexicon.Lexicon;
import simplenlg.lexicon.MultipleLexicon;
import simplenlg.lexicon.XMLLexicon;
import simplenlg.phrasespec.AdvPhraseSpec;
import simplenlg.phrasespec.NPPhraseSpec;
import simplenlg.phrasespec.PPPhraseSpec;
import simplenlg.phrasespec.SPhraseSpec;
import simplenlg.phrasespec.VPPhraseSpec;
import simplenlg.realiser.english.Realiser;

/**
 * @author SII068
 *
 */
public class SimpleNLGTest {

	public static void main(String[] args) {

		// As per the current exchange rate 1 euro is equals to 78 indian rupees.
		// 1 Euro is equals to 78 Indian Rupees.
		XMLLexicon defaultLex = new XMLLexicon("C:\\Users\\SII068\\Desktop\\chatbot-lexicon.xml");
		// XMLLexicon forexResponseLex = new XMLLe

		Lexicon lexicon = new MultipleLexicon(defaultLex);
		NLGFactory nlgFactory = new NLGFactory(lexicon);
		Realiser realiser = new Realiser(lexicon);

		//String sentence = getVariant2(realiser, nlgFactory);
		//String sentence = youWillGet(realiser, nlgFactory);
		//String sentence = getVariant3(realiser, nlgFactory);
		SPhraseSpec sentence = getBasePhraseSpec(realiser, nlgFactory);
		
		//element.setFeature(Feature.TENSE, );

		System.out.println(realiser.realiseSentence(sentence));

	}
	
	
	private static NLGElement getVariant1(Realiser realiser, NLGFactory nlgFactory) {
		//(On 2000-00-00|today) (price|rate) for XXX (slightly|significantly|-) (dropped|increased) and for 1 XXX you (will get|would have got) 123 YYY
		//On this day the exchange rate for Euro from Rupees slightly dropped and for 10 EUR you will get 700 INR.
	
		return null;
	}
	
	
	public static String getVariant2(Realiser realiser, NLGFactory nlgFactory) {
		NPPhraseSpec subject1 = nlgFactory.createNounPhrase("Mary");
		NPPhraseSpec subject2 = nlgFactory.createNounPhrase("your", "giraffe");
		CoordinatedPhraseElement subject = nlgFactory.createCoordinatedPhrase(subject1, subject2); 
		NPPhraseSpec object = nlgFactory.createNounPhrase("the monkey");
		VPPhraseSpec verb = nlgFactory.createVerbPhrase("chasing");
		//verb.setFeature(Feature.TENSE, Tense.PAST);
		
		subject1.addModifier("fast");
		
		SPhraseSpec spPhrase = nlgFactory.createClause();
		spPhrase.setSubject(subject);
		spPhrase.setObject(object);
		spPhrase.setVerb(verb);
		spPhrase.setFeature(Feature.TENSE, Tense.PRESENT);
		
		String fp = realiser.realiseSentence(spPhrase); // Realiser created earlier.
	    return fp;
	}
	
	public static String getVariant3(Realiser realiser, NLGFactory nlgFactory) {
		SPhraseSpec p = nlgFactory.createClause();
	    p.setSubject("Mary");
	    p.setVerb("chase");
	    p.setObject("the monkey");
	    p.setFeature(Feature.TENSE, Tense.FUTURE);
	    String fp = realiser.realiseSentence(p); // Realiser created earlier.
	    return fp;
	}
	
	
	public static SPhraseSpec getForexVariant(Realiser realiser, NLGFactory nlgFactory) {
		//On this day the exchange rate for Euro from Rupees slightly dropped and for 10 EUR you will get 700 INR.
		NPPhraseSpec subject = nlgFactory.createNounPhrase("the", "exchange rate");
		
		
		PPPhraseSpec forPrep = nlgFactory.createPrepositionPhrase("for");
		
		PPPhraseSpec fromPrep = nlgFactory.createPrepositionPhrase("from");
		
		//NPPhraseSpec subject2 = nlgFactory.createNounPhrase("your", "giraffe");
		//CoordinatedPhraseElement subject = nlgFactory.createCoordinatedPhrase(subject1, subject2); 
		NPPhraseSpec toObject = nlgFactory.createNounPhrase("Rupee");
		toObject.setPreModifier(forPrep);
		subject.setPostModifier(toObject);
		
		NPPhraseSpec fromObject = nlgFactory.createNounPhrase("from", "Euro");
		//fromObject.setPreModifier(fromPrep);
		
		//toObject.setPreModifier(fromObject);
		
		AdvPhraseSpec advP = nlgFactory.createAdverbPhrase("slight");
		
		VPPhraseSpec verb = nlgFactory.createVerbPhrase("drop");
		//verb.setFeature(Feature.TENSE, Tense.PAST);
		verb.addComplement(advP);
		verb.setPreModifier(fromObject);
		
		SPhraseSpec spPhrase = nlgFactory.createClause();
		spPhrase.setSubject(subject);
		//spPhrase.setObject(fromObject);
		spPhrase.setVerb(verb);
		spPhrase.setFeature(Feature.TENSE, Tense.PRESENT);
		spPhrase.addFrontModifier("today");
		
		//nlgFactory.createPrepositionPhrase(preposition)
		
		String fp = realiser.realiseSentence(spPhrase); // Realiser created earlier.
	    return spPhrase;
	}
	
	

	private static NLGElement getNLGElement(Realiser realiser, NLGFactory nlgFactory) {
		// case - 1
		int amount = 1;
		String fromCurr = "EUR";
		String toCurr = "INR";
		double exRate = 78.29;

		NPPhraseSpec subject = nlgFactory.createNounPhrase(fromCurr);
		subject.setPreModifier(String.valueOf(amount));
		PPPhraseSpec prepPhrase = nlgFactory.createPrepositionPhrase("equals to");
		subject.addComplement(prepPhrase);
		NPPhraseSpec object = nlgFactory.createNounPhrase(toCurr);
		object.setPreModifier(String.valueOf(exRate));

		SPhraseSpec spPhrase = nlgFactory.createClause();
		spPhrase.setSubject(subject);
		spPhrase.setObject(object);

		/*
		 * DocumentElement paragraph = nlgFactory.createParagraph();
		 * paragraph.addComponent(subject); paragraph.addComponent(prepPhrase);
		 * paragraph.addComponent(object);
		 */

		return realiser.realise(spPhrase);
	}
	
	
	public static SPhraseSpec getBasePhraseSpec(Realiser realiser, NLGFactory nlgFactory) {
		int amount = 10;
		String fromCurr = "EUR";
		String toCurr = "INR";
		//double exchangeRate = forexResponse.getRates().get(forexRequest.getToCurrency());
		
		
		PPPhraseSpec prpPhrase = nlgFactory.createPrepositionPhrase("for");
		NPPhraseSpec np = nlgFactory.createNounPhrase("you");
		VPPhraseSpec vp = nlgFactory.createVerbPhrase("get");
		
		NPPhraseSpec subject = nlgFactory.createNounPhrase(fromCurr);
		subject.setPreModifier(String.valueOf(amount));
		subject.setPostModifier(np);
		//VPPhraseSpec createVerbPhrase = nlgFactory.createVerbPhrase();
		//AdjPhraseSpec adjPhraseSpec = nlgFactory.createAdjectivePhrase();
		NPPhraseSpec object = nlgFactory.createNounPhrase(toCurr);
		object.setPreModifier(String.valueOf(700));
		
		
		SPhraseSpec spPhrase = nlgFactory.createClause();
		spPhrase.setFrontModifier(prpPhrase);
		spPhrase.setSubject(subject);
		spPhrase.setVerb(vp);
		spPhrase.setObject(object);
		//spPhrase.setFeature(Feature.MODAL, "will");
		spPhrase.setFeature(Feature.TENSE, Tense.FUTURE);
		spPhrase.setFeature(Feature.PROGRESSIVE, Boolean.TRUE);
		spPhrase.setPlural(Boolean.TRUE);
		
		return spPhrase;
	}
	
	
	public static String youWillGet(Realiser realiser, NLGFactory nf) {
		SPhraseSpec spPhrase2 = getBasePhraseSpec(realiser, nf);
		/*
		 * SPhraseSpec spPhrase1 = getPhraseSpec(realiser, nf); CoordinatedPhraseElement
		 * fullPhrase = nf.createCoordinatedPhrase(spPhrase1, spPhrase2);
		 * realiser.realiseSentence(fullPhrase);
		 */
		//nf.createPrepositionPhrase(preposition, complement)
		NPPhraseSpec np = nf.createNounPhrase();
		np.setSpecifier("you");
		VPPhraseSpec vp = nf.createVerbPhrase();
		vp.setVerb("get");
		NPPhraseSpec object = nf.createNounPhrase("INR");
		object.setPreModifier(String.valueOf(700));
		
		//SPhraseSpec spPhrase = nf.createClause();
		spPhrase2.setSubject(np);
		//spPhrase.setVerb("will");
		spPhrase2.setVerb(vp);
		spPhrase2.setObject(object);
		spPhrase2.setFeature(Feature.TENSE, Tense.FUTURE);
		
		SPhraseSpec spPhrase1 = getForexVariant(realiser, nf);
		CoordinatedPhraseElement fullPhrase = nf.createCoordinatedPhrase(spPhrase1, spPhrase2);
		return realiser.realiseSentence(fullPhrase);
		//return realise.getRealisation();
	}

}
