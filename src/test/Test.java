package test;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.codehaus.jackson.JsonNode;
import org.codehaus.jackson.JsonProcessingException;
import org.codehaus.jackson.map.ObjectMapper;


public class Test {
	// currentODataEntities = this.fillExpand(currentODataEntities,
	// navigationPropertySegment);

	private enum EVENTTYPE{
		POCONFIRMEDEVENT("POConfirmedEvent"),
		POGOODSRECEIVEDEVENT("POGoodsReceivedEvent"),
		INBDELPACKINGEVENT("InbDelPackingEvent"),
		INBDELPUTAWAYEVENT("InbDelPutAwayEvent"),
		INBDELGOODSRECEIPTEVENT("InbDelGoodsReceiptEvent");
		private String eventTypeName;
		
		public String getEventTypeName() {
			return eventTypeName;
		}

		EVENTTYPE(String eventTypeName){
			this.eventTypeName = eventTypeName;
		}
		public static boolean exists(String eventTypeName) {
            for (EVENTTYPE type : EVENTTYPE.values()) {
                if (type.getEventTypeName().equals(eventTypeName)) {
                    return true;
                }
            }
            return false;
        }
		
		
	}
	
	public static List<Hero> testList() {
		List<Hero> heros = new ArrayList<>();
		Hero h = new Hero();
		h.setName("zhangsan");
		heros.add(h);
		return heros;
	}

	public static void main(String[] args) throws JsonProcessingException, IOException {
		
		
		if(EVENTTYPE.exists("POConfirmedEven")){
			System.out.printf("true");
		}else{
			System.out.printf("f");
		}
		

		// List<Hero> lh = new ArrayList<>();
		// Hero h1 = new Hero("Tom");
		// Hero h2 = new Hero("Tom");
		// System.out.println(h1.equals(h2));
		//
		// System.out.println(h1.hashCode());
		// System.out.println(h2.hashCode());

		// h.setName("Lisi");
		// lh.add(h);

		// lh = testList();

		// String s = new String("hello");
		// System.out.println(s.hashCode());
		// Hero h = new Hero();
		// h.setName(s);
		// System.out.println(s.hashCode());
		// System.out.println(h.getName());
		//
		// Hero hero = new Hero("jack");
		// System.out.println(hero.toString());
		// Human hu = new Human();
		// hu.setHero(hero);
		// hero = new Hero("rose");
		//// hero.setName("rose");
		// System.out.println(hero.toString());
		// hu.speak();

		// What the JSON value must match exactly
		// Not anchored since it will be used with the (misnamed) .matches()
		// method
//		final Pattern pattern = Pattern.compile("\\\\/Date\\((\\d+)(-\\d+)?\\)\\\\/");

//		final ObjectMapper mapper = new ObjectMapper();

		// Parse JSON...
//		final JsonNode node = mapper.readTree("{\"PostingDate\": \"\\/Date(1325134800000)\\/\"}");

//		if (!node.has("PostingDate")) {
//			System.err.println("Bad JSON input!");
//			System.exit(1);
//		}
//		
//		String s = "/Date(1325134800000)/";

		// get just the "1325134800000-0500" part - you can also do s.substring(6, 24)
//		String regex = ".*/Date\\(([\\d\\+\\-]+)\\)/.*";
//		String replacement = "$1";
//		
//		s = s.replaceAll(regex, replacement);

		// Get relevant field
//		final String dateSpec = node.get("PostingDate").getTextValue();
//		Long l = Long.valueOf(s);

		// Try and match the input.
//		final Matcher matcher = pattern.matcher(dateSpec);
//
//		if (!matcher.matches()) {
//			System.err.println("Bad pattern!"); // Yuck
//			System.exit(1);
//		}

		// The first group capture the milliseconds, the second one the time
		// zone

//		final long millis = Long.parseLong(matcher.group(1));
//		String tz = matcher.group(2);
//		if (tz.isEmpty()) // It can happen, in which case the default is assumed
//							// to be...
//			tz = "+0000";

		// Instantiate a date object...
//		final Date date = new Date(millis);

		// And print it using an appropriate date format
//		System.out.printf("Date: %s %s\n", new SimpleDateFormat("yyyy/MM/dd HH:MM:ss").format(date), tz);

	}
}