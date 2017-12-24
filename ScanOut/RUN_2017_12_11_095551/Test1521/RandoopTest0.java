
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone(100, "hi!", 0, 100, 1, 10, (-1), 100, 0, 10, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone((-1), "hi!", (-1), 10, 100, 1, 10, 0, (-1), 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.lang.String[] var1 = java.util.TimeZone.getAvailableIDs((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkCreateClassLoader();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.reflect.InvocationHandler var1 = java.lang.reflect.Proxy.getInvocationHandler((java.lang.Object)0.0f);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var2 = new java.util.Hashtable(0, (-1.0f));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.String var3 = var0.getDisplayName(false, 10);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var11 = new java.util.SimpleTimeZone(0, "", 0, 0, 10, 1, 10, (-1), 0, 1, 100);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.SimpleTimeZone var10 = new java.util.SimpleTimeZone((-1), "", 1, 100, 10, 1, 100, (-1), (-1), (-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    long var6 = java.util.Date.UTC((-1), 100, (-1), 1, (-1), 10);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-1977951650000L));

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkPackageDefinition("");
    boolean var4 = var0.checkTopLevelWindow((java.lang.Object)100.0f);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkSystemClipboardAccess();
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var4 == false);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.Map var0 = sun.util.calendar.ZoneInfo.getAliasTable();
    java.util.Hashtable var1 = new java.util.Hashtable(var0);
    java.lang.Object var3 = var1.get((java.lang.Object)1.0f);
    java.lang.String var4 = var1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var4 + "' != '" + "{America/St_Thomas=America/Port_of_Spain, US/Central=America/Chicago, CNT=America/St_Johns, Canada/Central=America/Winnipeg, Navajo=America/Denver, ACT=Australia/Darwin, Europe/Podgorica=Europe/Belgrade, Africa/Gaborone=Africa/Maputo, PST=America/Los_Angeles, America/Coral_Harbour=America/Atikokan, Mideast/Riyadh89=Asia/Riyadh89, Mideast/Riyadh88=Asia/Riyadh88, Mideast/Riyadh87=Asia/Riyadh87, US/Pacific-New=America/Los_Angeles, ROK=Asia/Seoul, America/Virgin=America/Port_of_Spain, MIT=Pacific/Apia, Europe/Bratislava=Europe/Prague, PRT=America/Puerto_Rico, Africa/Nouakchott=Africa/Abidjan, Australia/South=Australia/Adelaide, Pacific/Ponape=Pacific/Pohnpei, US/Pacific=America/Los_Angeles, Africa/Ouagadougou=Africa/Abidjan, America/Argentina/ComodRivadavia=America/Argentina/Catamarca, PRC=Asia/Shanghai, Australia/ACT=Australia/Sydney, Canada/Pacific=America/Vancouver, Australia/Queensland=Australia/Brisbane, Canada/Newfoundland=America/St_Johns, Africa/Asmara=Africa/Nairobi, Africa/Bamako=Africa/Abidjan, America/Lower_Princes=America/Curacao, Africa/Timbuktu=Africa/Abidjan, Africa/Blantyre=Africa/Maputo, America/Porto_Acre=America/Rio_Branco, Egypt=Africa/Cairo, Etc/GMT-0=Etc/GMT, Greenwich=Etc/GMT, America/Buenos_Aires=America/Argentina/Buenos_Aires, America/St_Lucia=America/Port_of_Spain, US/Samoa=Pacific/Pago_Pago, Atlantic/Faeroe=Atlantic/Faroe, America/Rosario=America/Argentina/Cordoba, Africa/Harare=Africa/Maputo, Atlantic/St_Helena=Africa/Abidjan, Europe/Busingen=Europe/Zurich, America/Cordoba=America/Argentina/Cordoba, Brazil/Acre=America/Rio_Branco, Universal=Etc/UTC, Africa/Addis_Ababa=Africa/Nairobi, America/Atka=America/Adak, America/Marigot=America/Port_of_Spain, GB-Eire=Europe/London, NET=Asia/Yerevan, Singapore=Asia/Singapore, Antarctica/South_Pole=Pacific/Auckland, America/Shiprock=America/Denver, Kwajalein=Pacific/Kwajalein, America/Indianapolis=America/Indiana/Indianapolis, Mexico/BajaSur=America/Mazatlan, Asia/Tel_Aviv=Asia/Jerusalem, Europe/Guernsey=Europe/London, Africa/Mbabane=Africa/Johannesburg, Europe/Jersey=Europe/London, America/Guadeloupe=America/Port_of_Spain, VST=Asia/Ho_Chi_Minh, Mexico/BajaNorte=America/Tijuana, Africa/Dakar=Africa/Abidjan, NST=Pacific/Auckland, Indian/Antananarivo=Africa/Nairobi, US/Hawaii=Pacific/Honolulu, Europe/Ljubljana=Europe/Belgrade, Asia/Vientiane=Asia/Bangkok, Australia/Canberra=Australia/Sydney, US/Mountain=America/Denver, Canada/Yukon=America/Whitehorse, US/Indiana-Starke=America/Indiana/Knox, Etc/GMT+0=Etc/GMT, Portugal=Europe/Lisbon, Africa/Juba=Africa/Khartoum, Africa/Mogadishu=Africa/Nairobi, Asia/Ujung_Pandang=Asia/Makassar, America/St_Vincent=America/Port_of_Spain, W-SU=Europe/Moscow, Asia/Kashgar=Asia/Urumqi, America/St_Kitts=America/Port_of_Spain, Asia/Harbin=Asia/Shanghai, Iran=Asia/Tehran, Asia/Thimbu=Asia/Thimphu, Libya=Africa/Tripoli, UTC=Etc/UTC, Asia/Ashkhabad=Asia/Ashgabat, PNT=America/Phoenix, Asia/Saigon=Asia/Ho_Chi_Minh, Asia/Dacca=Asia/Dhaka, Cuba=America/Havana, Europe/Vaduz=Europe/Zurich, America/Jujuy=America/Argentina/Jujuy, Australia/NSW=Australia/Sydney, Canada/East-Saskatchewan=America/Regina, Pacific/Johnston=Pacific/Honolulu, Europe/Mariehamn=Europe/Helsinki, US/Michigan=America/Detroit, Chile/Continental=America/Santiago, Australia/North=Australia/Darwin, Europe/Sarajevo=Europe/Belgrade, Africa/Banjul=Africa/Abidjan, US/Eastern=America/New_York, America/Fort_Wayne=America/Indiana/Indianapolis, Australia/LHI=Australia/Lord_Howe, Canada/Eastern=America/Toronto, NZ=Pacific/Auckland, Asia/Phnom_Penh=Asia/Bangkok, Arctic/Longyearbyen=Europe/Oslo, Mexico/General=America/Mexico_City, Europe/Skopje=Europe/Belgrade, America/Mendoza=America/Argentina/Mendoza, Africa/Conakry=Africa/Abidjan, America/Montserrat=America/Port_of_Spain, Africa/Lome=Africa/Abidjan, UCT=Etc/UCT, Africa/Brazzaville=Africa/Lagos, Africa/Niamey=Africa/Lagos, America/Knox_IN=America/Indiana/Knox, America/Louisville=America/Kentucky/Louisville, PLT=Asia/Karachi, Africa/Bujumbura=Africa/Maputo, ECT=Europe/Paris, Antarctica/McMurdo=Pacific/Auckland, America/Kralendijk=America/Curacao, America/St_Barthelemy=America/Port_of_Spain, Asia/Chongqing=Asia/Shanghai, Poland=Europe/Warsaw, Africa/Douala=Africa/Lagos, Africa/Malabo=Africa/Lagos, GMT=Etc/GMT, Europe/Tiraspol=Europe/Chisinau, Pacific/Samoa=Pacific/Pago_Pago, Africa/Maseru=Africa/Johannesburg, CTT=Asia/Shanghai, Africa/Kigali=Africa/Maputo, Pacific/Yap=Pacific/Chuuk, Africa/Libreville=Africa/Lagos, US/Arizona=America/Phoenix, US/East-Indiana=America/Indiana/Indianapolis, America/Dominica=America/Port_of_Spain, US/Alaska=America/Anchorage, Africa/Asmera=Africa/Nairobi, EAT=Africa/Nairobi, SST=Pacific/Guadalcanal, Asia/Kuwait=Asia/Riyadh, Asia/Katmandu=Asia/Kathmandu, CST=America/Chicago, Australia/Victoria=Australia/Melbourne, Africa/Kampala=Africa/Nairobi, Asia/Calcutta=Asia/Kolkata, Europe/Vatican=Europe/Rome, US/Aleutian=America/Adak, Africa/Lusaka=Africa/Maputo, Canada/Saskatchewan=America/Regina, Canada/Mountain=America/Edmonton, NZ-CHAT=Pacific/Chatham, Brazil/East=America/Sao_Paulo, Iceland=Atlantic/Reykjavik, Australia/Yancowinna=Australia/Broken_Hill, Asia/Chungking=Asia/Shanghai, Asia/Ulan_Bator=Asia/Ulaanbaatar, Zulu=Etc/UTC, AGT=America/Argentina/Buenos_Aires, Asia/Aden=Asia/Riyadh, Europe/San_Marino=Europe/Rome, BET=America/Sao_Paulo, Israel=Asia/Jerusalem, Australia/Tasmania=Australia/Hobart, Hongkong=Asia/Hong_Kong, America/Aruba=America/Curacao, Asia/Istanbul=Europe/Istanbul, JST=Asia/Tokyo, Africa/Lubumbashi=Africa/Maputo, Asia/Macao=Asia/Macau, BST=Asia/Dhaka, Atlantic/Jan_Mayen=Europe/Oslo, America/Anguilla=America/Port_of_Spain, Africa/Bangui=Africa/Lagos, America/Catamarca=America/Argentina/Catamarca, Indian/Mayotte=Africa/Nairobi, Africa/Sao_Tome=Africa/Abidjan, Europe/Belfast=Europe/London, Brazil/West=America/Manaus, Australia/West=Australia/Perth, America/Grenada=America/Port_of_Spain, Japan=Asia/Tokyo, GMT0=Etc/GMT, Africa/Dar_es_Salaam=Africa/Nairobi, America/Tortola=America/Port_of_Spain, Brazil/DeNoronha=America/Noronha, IET=America/Indiana/Indianapolis, Etc/Zulu=Etc/UTC, AET=Australia/Sydney, Africa/Kinshasa=Africa/Lagos, Africa/Luanda=Africa/Lagos, CAT=Africa/Maputo, IST=Asia/Kolkata, Africa/Porto-Novo=Africa/Lagos, Jamaica=America/Jamaica, Africa/Freetown=Africa/Abidjan, Etc/Greenwich=Etc/GMT, AST=America/Anchorage, Canada/Atlantic=America/Halifax, Europe/Zagreb=Europe/Belgrade, Asia/Muscat=Asia/Dubai, Asia/Bahrain=Asia/Qatar, Europe/Nicosia=Asia/Nicosia, Chile/EasterIsland=Pacific/Easter, Etc/Universal=Etc/UTC, Pacific/Truk=Pacific/Chuuk, Eire=Europe/Dublin, Indian/Comoro=Africa/Nairobi, Turkey=Europe/Istanbul, Europe/Isle_of_Man=Europe/London, GB=Europe/London, Africa/Djibouti=Africa/Nairobi, ART=Africa/Cairo, Etc/GMT0=Etc/GMT, America/Ensenada=America/Tijuana}"+ "'", var4.equals("{America/St_Thomas=America/Port_of_Spain, US/Central=America/Chicago, CNT=America/St_Johns, Canada/Central=America/Winnipeg, Navajo=America/Denver, ACT=Australia/Darwin, Europe/Podgorica=Europe/Belgrade, Africa/Gaborone=Africa/Maputo, PST=America/Los_Angeles, America/Coral_Harbour=America/Atikokan, Mideast/Riyadh89=Asia/Riyadh89, Mideast/Riyadh88=Asia/Riyadh88, Mideast/Riyadh87=Asia/Riyadh87, US/Pacific-New=America/Los_Angeles, ROK=Asia/Seoul, America/Virgin=America/Port_of_Spain, MIT=Pacific/Apia, Europe/Bratislava=Europe/Prague, PRT=America/Puerto_Rico, Africa/Nouakchott=Africa/Abidjan, Australia/South=Australia/Adelaide, Pacific/Ponape=Pacific/Pohnpei, US/Pacific=America/Los_Angeles, Africa/Ouagadougou=Africa/Abidjan, America/Argentina/ComodRivadavia=America/Argentina/Catamarca, PRC=Asia/Shanghai, Australia/ACT=Australia/Sydney, Canada/Pacific=America/Vancouver, Australia/Queensland=Australia/Brisbane, Canada/Newfoundland=America/St_Johns, Africa/Asmara=Africa/Nairobi, Africa/Bamako=Africa/Abidjan, America/Lower_Princes=America/Curacao, Africa/Timbuktu=Africa/Abidjan, Africa/Blantyre=Africa/Maputo, America/Porto_Acre=America/Rio_Branco, Egypt=Africa/Cairo, Etc/GMT-0=Etc/GMT, Greenwich=Etc/GMT, America/Buenos_Aires=America/Argentina/Buenos_Aires, America/St_Lucia=America/Port_of_Spain, US/Samoa=Pacific/Pago_Pago, Atlantic/Faeroe=Atlantic/Faroe, America/Rosario=America/Argentina/Cordoba, Africa/Harare=Africa/Maputo, Atlantic/St_Helena=Africa/Abidjan, Europe/Busingen=Europe/Zurich, America/Cordoba=America/Argentina/Cordoba, Brazil/Acre=America/Rio_Branco, Universal=Etc/UTC, Africa/Addis_Ababa=Africa/Nairobi, America/Atka=America/Adak, America/Marigot=America/Port_of_Spain, GB-Eire=Europe/London, NET=Asia/Yerevan, Singapore=Asia/Singapore, Antarctica/South_Pole=Pacific/Auckland, America/Shiprock=America/Denver, Kwajalein=Pacific/Kwajalein, America/Indianapolis=America/Indiana/Indianapolis, Mexico/BajaSur=America/Mazatlan, Asia/Tel_Aviv=Asia/Jerusalem, Europe/Guernsey=Europe/London, Africa/Mbabane=Africa/Johannesburg, Europe/Jersey=Europe/London, America/Guadeloupe=America/Port_of_Spain, VST=Asia/Ho_Chi_Minh, Mexico/BajaNorte=America/Tijuana, Africa/Dakar=Africa/Abidjan, NST=Pacific/Auckland, Indian/Antananarivo=Africa/Nairobi, US/Hawaii=Pacific/Honolulu, Europe/Ljubljana=Europe/Belgrade, Asia/Vientiane=Asia/Bangkok, Australia/Canberra=Australia/Sydney, US/Mountain=America/Denver, Canada/Yukon=America/Whitehorse, US/Indiana-Starke=America/Indiana/Knox, Etc/GMT+0=Etc/GMT, Portugal=Europe/Lisbon, Africa/Juba=Africa/Khartoum, Africa/Mogadishu=Africa/Nairobi, Asia/Ujung_Pandang=Asia/Makassar, America/St_Vincent=America/Port_of_Spain, W-SU=Europe/Moscow, Asia/Kashgar=Asia/Urumqi, America/St_Kitts=America/Port_of_Spain, Asia/Harbin=Asia/Shanghai, Iran=Asia/Tehran, Asia/Thimbu=Asia/Thimphu, Libya=Africa/Tripoli, UTC=Etc/UTC, Asia/Ashkhabad=Asia/Ashgabat, PNT=America/Phoenix, Asia/Saigon=Asia/Ho_Chi_Minh, Asia/Dacca=Asia/Dhaka, Cuba=America/Havana, Europe/Vaduz=Europe/Zurich, America/Jujuy=America/Argentina/Jujuy, Australia/NSW=Australia/Sydney, Canada/East-Saskatchewan=America/Regina, Pacific/Johnston=Pacific/Honolulu, Europe/Mariehamn=Europe/Helsinki, US/Michigan=America/Detroit, Chile/Continental=America/Santiago, Australia/North=Australia/Darwin, Europe/Sarajevo=Europe/Belgrade, Africa/Banjul=Africa/Abidjan, US/Eastern=America/New_York, America/Fort_Wayne=America/Indiana/Indianapolis, Australia/LHI=Australia/Lord_Howe, Canada/Eastern=America/Toronto, NZ=Pacific/Auckland, Asia/Phnom_Penh=Asia/Bangkok, Arctic/Longyearbyen=Europe/Oslo, Mexico/General=America/Mexico_City, Europe/Skopje=Europe/Belgrade, America/Mendoza=America/Argentina/Mendoza, Africa/Conakry=Africa/Abidjan, America/Montserrat=America/Port_of_Spain, Africa/Lome=Africa/Abidjan, UCT=Etc/UCT, Africa/Brazzaville=Africa/Lagos, Africa/Niamey=Africa/Lagos, America/Knox_IN=America/Indiana/Knox, America/Louisville=America/Kentucky/Louisville, PLT=Asia/Karachi, Africa/Bujumbura=Africa/Maputo, ECT=Europe/Paris, Antarctica/McMurdo=Pacific/Auckland, America/Kralendijk=America/Curacao, America/St_Barthelemy=America/Port_of_Spain, Asia/Chongqing=Asia/Shanghai, Poland=Europe/Warsaw, Africa/Douala=Africa/Lagos, Africa/Malabo=Africa/Lagos, GMT=Etc/GMT, Europe/Tiraspol=Europe/Chisinau, Pacific/Samoa=Pacific/Pago_Pago, Africa/Maseru=Africa/Johannesburg, CTT=Asia/Shanghai, Africa/Kigali=Africa/Maputo, Pacific/Yap=Pacific/Chuuk, Africa/Libreville=Africa/Lagos, US/Arizona=America/Phoenix, US/East-Indiana=America/Indiana/Indianapolis, America/Dominica=America/Port_of_Spain, US/Alaska=America/Anchorage, Africa/Asmera=Africa/Nairobi, EAT=Africa/Nairobi, SST=Pacific/Guadalcanal, Asia/Kuwait=Asia/Riyadh, Asia/Katmandu=Asia/Kathmandu, CST=America/Chicago, Australia/Victoria=Australia/Melbourne, Africa/Kampala=Africa/Nairobi, Asia/Calcutta=Asia/Kolkata, Europe/Vatican=Europe/Rome, US/Aleutian=America/Adak, Africa/Lusaka=Africa/Maputo, Canada/Saskatchewan=America/Regina, Canada/Mountain=America/Edmonton, NZ-CHAT=Pacific/Chatham, Brazil/East=America/Sao_Paulo, Iceland=Atlantic/Reykjavik, Australia/Yancowinna=Australia/Broken_Hill, Asia/Chungking=Asia/Shanghai, Asia/Ulan_Bator=Asia/Ulaanbaatar, Zulu=Etc/UTC, AGT=America/Argentina/Buenos_Aires, Asia/Aden=Asia/Riyadh, Europe/San_Marino=Europe/Rome, BET=America/Sao_Paulo, Israel=Asia/Jerusalem, Australia/Tasmania=Australia/Hobart, Hongkong=Asia/Hong_Kong, America/Aruba=America/Curacao, Asia/Istanbul=Europe/Istanbul, JST=Asia/Tokyo, Africa/Lubumbashi=Africa/Maputo, Asia/Macao=Asia/Macau, BST=Asia/Dhaka, Atlantic/Jan_Mayen=Europe/Oslo, America/Anguilla=America/Port_of_Spain, Africa/Bangui=Africa/Lagos, America/Catamarca=America/Argentina/Catamarca, Indian/Mayotte=Africa/Nairobi, Africa/Sao_Tome=Africa/Abidjan, Europe/Belfast=Europe/London, Brazil/West=America/Manaus, Australia/West=Australia/Perth, America/Grenada=America/Port_of_Spain, Japan=Asia/Tokyo, GMT0=Etc/GMT, Africa/Dar_es_Salaam=Africa/Nairobi, America/Tortola=America/Port_of_Spain, Brazil/DeNoronha=America/Noronha, IET=America/Indiana/Indianapolis, Etc/Zulu=Etc/UTC, AET=Australia/Sydney, Africa/Kinshasa=Africa/Lagos, Africa/Luanda=Africa/Lagos, CAT=Africa/Maputo, IST=Asia/Kolkata, Africa/Porto-Novo=Africa/Lagos, Jamaica=America/Jamaica, Africa/Freetown=Africa/Abidjan, Etc/Greenwich=Etc/GMT, AST=America/Anchorage, Canada/Atlantic=America/Halifax, Europe/Zagreb=Europe/Belgrade, Asia/Muscat=Asia/Dubai, Asia/Bahrain=Asia/Qatar, Europe/Nicosia=Asia/Nicosia, Chile/EasterIsland=Pacific/Easter, Etc/Universal=Etc/UTC, Pacific/Truk=Pacific/Chuuk, Eire=Europe/Dublin, Indian/Comoro=Africa/Nairobi, Turkey=Europe/Istanbul, Europe/Isle_of_Man=Europe/London, GB=Europe/London, Africa/Djibouti=Africa/Nairobi, ART=Africa/Cairo, Etc/GMT0=Etc/GMT, America/Ensenada=America/Tijuana}"));

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    com.sun.crypto.provider.JceKeyStore var0 = new com.sun.crypto.provider.JceKeyStore();
    byte[] var3 = new byte[] { (byte)(-1)};
    java.security.cert.Certificate[] var4 = new java.security.cert.Certificate[] { };
    var0.engineSetKeyEntry("", var3, var4);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    java.security.ProtectionDomain[] var0 = new java.security.ProtectionDomain[] { };
    java.security.AccessControlContext var1 = new java.security.AccessControlContext(var0);
    java.security.DomainCombiner var2 = var1.getDomainCombiner();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var2);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    java.util.TimeZone.setDefault(var0);
    java.util.TimeZone.setDefault(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkExec("");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.Map var0 = sun.util.calendar.ZoneInfo.getAliasTable();
    java.util.Hashtable var1 = new java.util.Hashtable(var0);
    boolean var3 = var1.contains((java.lang.Object)'a');
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var3 == false);

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkWrite("{America/St_Thomas=America/Port_of_Spain, US/Central=America/Chicago, CNT=America/St_Johns, Canada/Central=America/Winnipeg, Navajo=America/Denver, ACT=Australia/Darwin, Europe/Podgorica=Europe/Belgrade, Africa/Gaborone=Africa/Maputo, PST=America/Los_Angeles, America/Coral_Harbour=America/Atikokan, Mideast/Riyadh89=Asia/Riyadh89, Mideast/Riyadh88=Asia/Riyadh88, Mideast/Riyadh87=Asia/Riyadh87, US/Pacific-New=America/Los_Angeles, ROK=Asia/Seoul, America/Virgin=America/Port_of_Spain, MIT=Pacific/Apia, Europe/Bratislava=Europe/Prague, PRT=America/Puerto_Rico, Africa/Nouakchott=Africa/Abidjan, Australia/South=Australia/Adelaide, Pacific/Ponape=Pacific/Pohnpei, US/Pacific=America/Los_Angeles, Africa/Ouagadougou=Africa/Abidjan, America/Argentina/ComodRivadavia=America/Argentina/Catamarca, PRC=Asia/Shanghai, Australia/ACT=Australia/Sydney, Canada/Pacific=America/Vancouver, Australia/Queensland=Australia/Brisbane, Canada/Newfoundland=America/St_Johns, Africa/Asmara=Africa/Nairobi, Africa/Bamako=Africa/Abidjan, America/Lower_Princes=America/Curacao, Africa/Timbuktu=Africa/Abidjan, Africa/Blantyre=Africa/Maputo, America/Porto_Acre=America/Rio_Branco, Egypt=Africa/Cairo, Etc/GMT-0=Etc/GMT, Greenwich=Etc/GMT, America/Buenos_Aires=America/Argentina/Buenos_Aires, America/St_Lucia=America/Port_of_Spain, US/Samoa=Pacific/Pago_Pago, Atlantic/Faeroe=Atlantic/Faroe, America/Rosario=America/Argentina/Cordoba, Africa/Harare=Africa/Maputo, Atlantic/St_Helena=Africa/Abidjan, Europe/Busingen=Europe/Zurich, America/Cordoba=America/Argentina/Cordoba, Brazil/Acre=America/Rio_Branco, Universal=Etc/UTC, Africa/Addis_Ababa=Africa/Nairobi, America/Atka=America/Adak, America/Marigot=America/Port_of_Spain, GB-Eire=Europe/London, NET=Asia/Yerevan, Singapore=Asia/Singapore, Antarctica/South_Pole=Pacific/Auckland, America/Shiprock=America/Denver, Kwajalein=Pacific/Kwajalein, America/Indianapolis=America/Indiana/Indianapolis, Mexico/BajaSur=America/Mazatlan, Asia/Tel_Aviv=Asia/Jerusalem, Europe/Guernsey=Europe/London, Africa/Mbabane=Africa/Johannesburg, Europe/Jersey=Europe/London, America/Guadeloupe=America/Port_of_Spain, VST=Asia/Ho_Chi_Minh, Mexico/BajaNorte=America/Tijuana, Africa/Dakar=Africa/Abidjan, NST=Pacific/Auckland, Indian/Antananarivo=Africa/Nairobi, US/Hawaii=Pacific/Honolulu, Europe/Ljubljana=Europe/Belgrade, Asia/Vientiane=Asia/Bangkok, Australia/Canberra=Australia/Sydney, US/Mountain=America/Denver, Canada/Yukon=America/Whitehorse, US/Indiana-Starke=America/Indiana/Knox, Etc/GMT+0=Etc/GMT, Portugal=Europe/Lisbon, Africa/Juba=Africa/Khartoum, Africa/Mogadishu=Africa/Nairobi, Asia/Ujung_Pandang=Asia/Makassar, America/St_Vincent=America/Port_of_Spain, W-SU=Europe/Moscow, Asia/Kashgar=Asia/Urumqi, America/St_Kitts=America/Port_of_Spain, Asia/Harbin=Asia/Shanghai, Iran=Asia/Tehran, Asia/Thimbu=Asia/Thimphu, Libya=Africa/Tripoli, UTC=Etc/UTC, Asia/Ashkhabad=Asia/Ashgabat, PNT=America/Phoenix, Asia/Saigon=Asia/Ho_Chi_Minh, Asia/Dacca=Asia/Dhaka, Cuba=America/Havana, Europe/Vaduz=Europe/Zurich, America/Jujuy=America/Argentina/Jujuy, Australia/NSW=Australia/Sydney, Canada/East-Saskatchewan=America/Regina, Pacific/Johnston=Pacific/Honolulu, Europe/Mariehamn=Europe/Helsinki, US/Michigan=America/Detroit, Chile/Continental=America/Santiago, Australia/North=Australia/Darwin, Europe/Sarajevo=Europe/Belgrade, Africa/Banjul=Africa/Abidjan, US/Eastern=America/New_York, America/Fort_Wayne=America/Indiana/Indianapolis, Australia/LHI=Australia/Lord_Howe, Canada/Eastern=America/Toronto, NZ=Pacific/Auckland, Asia/Phnom_Penh=Asia/Bangkok, Arctic/Longyearbyen=Europe/Oslo, Mexico/General=America/Mexico_City, Europe/Skopje=Europe/Belgrade, America/Mendoza=America/Argentina/Mendoza, Africa/Conakry=Africa/Abidjan, America/Montserrat=America/Port_of_Spain, Africa/Lome=Africa/Abidjan, UCT=Etc/UCT, Africa/Brazzaville=Africa/Lagos, Africa/Niamey=Africa/Lagos, America/Knox_IN=America/Indiana/Knox, America/Louisville=America/Kentucky/Louisville, PLT=Asia/Karachi, Africa/Bujumbura=Africa/Maputo, ECT=Europe/Paris, Antarctica/McMurdo=Pacific/Auckland, America/Kralendijk=America/Curacao, America/St_Barthelemy=America/Port_of_Spain, Asia/Chongqing=Asia/Shanghai, Poland=Europe/Warsaw, Africa/Douala=Africa/Lagos, Africa/Malabo=Africa/Lagos, GMT=Etc/GMT, Europe/Tiraspol=Europe/Chisinau, Pacific/Samoa=Pacific/Pago_Pago, Africa/Maseru=Africa/Johannesburg, CTT=Asia/Shanghai, Africa/Kigali=Africa/Maputo, Pacific/Yap=Pacific/Chuuk, Africa/Libreville=Africa/Lagos, US/Arizona=America/Phoenix, US/East-Indiana=America/Indiana/Indianapolis, America/Dominica=America/Port_of_Spain, US/Alaska=America/Anchorage, Africa/Asmera=Africa/Nairobi, EAT=Africa/Nairobi, SST=Pacific/Guadalcanal, Asia/Kuwait=Asia/Riyadh, Asia/Katmandu=Asia/Kathmandu, CST=America/Chicago, Australia/Victoria=Australia/Melbourne, Africa/Kampala=Africa/Nairobi, Asia/Calcutta=Asia/Kolkata, Europe/Vatican=Europe/Rome, US/Aleutian=America/Adak, Africa/Lusaka=Africa/Maputo, Canada/Saskatchewan=America/Regina, Canada/Mountain=America/Edmonton, NZ-CHAT=Pacific/Chatham, Brazil/East=America/Sao_Paulo, Iceland=Atlantic/Reykjavik, Australia/Yancowinna=Australia/Broken_Hill, Asia/Chungking=Asia/Shanghai, Asia/Ulan_Bator=Asia/Ulaanbaatar, Zulu=Etc/UTC, AGT=America/Argentina/Buenos_Aires, Asia/Aden=Asia/Riyadh, Europe/San_Marino=Europe/Rome, BET=America/Sao_Paulo, Israel=Asia/Jerusalem, Australia/Tasmania=Australia/Hobart, Hongkong=Asia/Hong_Kong, America/Aruba=America/Curacao, Asia/Istanbul=Europe/Istanbul, JST=Asia/Tokyo, Africa/Lubumbashi=Africa/Maputo, Asia/Macao=Asia/Macau, BST=Asia/Dhaka, Atlantic/Jan_Mayen=Europe/Oslo, America/Anguilla=America/Port_of_Spain, Africa/Bangui=Africa/Lagos, America/Catamarca=America/Argentina/Catamarca, Indian/Mayotte=Africa/Nairobi, Africa/Sao_Tome=Africa/Abidjan, Europe/Belfast=Europe/London, Brazil/West=America/Manaus, Australia/West=Australia/Perth, America/Grenada=America/Port_of_Spain, Japan=Asia/Tokyo, GMT0=Etc/GMT, Africa/Dar_es_Salaam=Africa/Nairobi, America/Tortola=America/Port_of_Spain, Brazil/DeNoronha=America/Noronha, IET=America/Indiana/Indianapolis, Etc/Zulu=Etc/UTC, AET=Australia/Sydney, Africa/Kinshasa=Africa/Lagos, Africa/Luanda=Africa/Lagos, CAT=Africa/Maputo, IST=Asia/Kolkata, Africa/Porto-Novo=Africa/Lagos, Jamaica=America/Jamaica, Africa/Freetown=Africa/Abidjan, Etc/Greenwich=Etc/GMT, AST=America/Anchorage, Canada/Atlantic=America/Halifax, Europe/Zagreb=Europe/Belgrade, Asia/Muscat=Asia/Dubai, Asia/Bahrain=Asia/Qatar, Europe/Nicosia=Asia/Nicosia, Chile/EasterIsland=Pacific/Easter, Etc/Universal=Etc/UTC, Pacific/Truk=Pacific/Chuuk, Eire=Europe/Dublin, Indian/Comoro=Africa/Nairobi, Turkey=Europe/Istanbul, Europe/Isle_of_Man=Europe/London, GB=Europe/London, Africa/Djibouti=Africa/Nairobi, ART=Africa/Cairo, Etc/GMT0=Etc/GMT, America/Ensenada=America/Tijuana}");
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    java.util.Map var0 = sun.util.calendar.ZoneInfo.getAliasTable();
    java.util.Hashtable var1 = new java.util.Hashtable(var0);
    java.util.Hashtable var2 = new java.util.Hashtable(var0);
    java.util.Set var3 = var2.entrySet();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var3);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    java.util.TimeZone.setDefault(var0);
    java.lang.String var2 = var0.getDisplayName();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var2 + "' != '" + "India Standard Time"+ "'", var2.equals("India Standard Time"));

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.Date var6 = new java.util.Date(1, 100, 1, 10, 1, (-1));
    var6.setMinutes(100);

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.lang.Class var1 = java.lang.Class.forName("1 May 1909 04:07:39 GMT");
      fail("Expected exception of type java.lang.ClassNotFoundException");
    } catch (java.lang.ClassNotFoundException e) {
      // Expected exception.
    }

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    java.util.Date var6 = new java.util.Date(1, 100, 1, 10, 1, (-1));
    int var7 = var6.getMinutes();
    java.util.Date var14 = new java.util.Date(1, 100, 1, 10, 1, (-1));
    int var15 = var6.compareTo(var14);
    var6.setMinutes((-1));
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var15 == 0);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    java.util.Date var6 = new java.util.Date(1, 100, 1, 10, 1, (-1));
    int var7 = var6.getMinutes();
    java.lang.String var8 = var6.toGMTString();
    var6.setSeconds(0);

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.security.Permissions var0 = new java.security.Permissions();

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    java.lang.String[] var0 = java.util.TimeZone.getAvailableIDs();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test28() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test28"); }


    long var6 = java.util.Date.UTC(0, (-1), 1, 100, (-1), 1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-2211307259000L));

  }

  public void test29() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test29"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkPackageDefinition("");
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkAccept("{America/St_Thomas=America/Port_of_Spain, US/Central=America/Chicago, CNT=America/St_Johns, Canada/Central=America/Winnipeg, Navajo=America/Denver, ACT=Australia/Darwin, Europe/Podgorica=Europe/Belgrade, Africa/Gaborone=Africa/Maputo, PST=America/Los_Angeles, America/Coral_Harbour=America/Atikokan, Mideast/Riyadh89=Asia/Riyadh89, Mideast/Riyadh88=Asia/Riyadh88, Mideast/Riyadh87=Asia/Riyadh87, US/Pacific-New=America/Los_Angeles, ROK=Asia/Seoul, America/Virgin=America/Port_of_Spain, MIT=Pacific/Apia, Europe/Bratislava=Europe/Prague, PRT=America/Puerto_Rico, Africa/Nouakchott=Africa/Abidjan, Australia/South=Australia/Adelaide, Pacific/Ponape=Pacific/Pohnpei, US/Pacific=America/Los_Angeles, Africa/Ouagadougou=Africa/Abidjan, America/Argentina/ComodRivadavia=America/Argentina/Catamarca, PRC=Asia/Shanghai, Australia/ACT=Australia/Sydney, Canada/Pacific=America/Vancouver, Australia/Queensland=Australia/Brisbane, Canada/Newfoundland=America/St_Johns, Africa/Asmara=Africa/Nairobi, Africa/Bamako=Africa/Abidjan, America/Lower_Princes=America/Curacao, Africa/Timbuktu=Africa/Abidjan, Africa/Blantyre=Africa/Maputo, America/Porto_Acre=America/Rio_Branco, Egypt=Africa/Cairo, Etc/GMT-0=Etc/GMT, Greenwich=Etc/GMT, America/Buenos_Aires=America/Argentina/Buenos_Aires, America/St_Lucia=America/Port_of_Spain, US/Samoa=Pacific/Pago_Pago, Atlantic/Faeroe=Atlantic/Faroe, America/Rosario=America/Argentina/Cordoba, Africa/Harare=Africa/Maputo, Atlantic/St_Helena=Africa/Abidjan, Europe/Busingen=Europe/Zurich, America/Cordoba=America/Argentina/Cordoba, Brazil/Acre=America/Rio_Branco, Universal=Etc/UTC, Africa/Addis_Ababa=Africa/Nairobi, America/Atka=America/Adak, America/Marigot=America/Port_of_Spain, GB-Eire=Europe/London, NET=Asia/Yerevan, Singapore=Asia/Singapore, Antarctica/South_Pole=Pacific/Auckland, America/Shiprock=America/Denver, Kwajalein=Pacific/Kwajalein, America/Indianapolis=America/Indiana/Indianapolis, Mexico/BajaSur=America/Mazatlan, Asia/Tel_Aviv=Asia/Jerusalem, Europe/Guernsey=Europe/London, Africa/Mbabane=Africa/Johannesburg, Europe/Jersey=Europe/London, America/Guadeloupe=America/Port_of_Spain, VST=Asia/Ho_Chi_Minh, Mexico/BajaNorte=America/Tijuana, Africa/Dakar=Africa/Abidjan, NST=Pacific/Auckland, Indian/Antananarivo=Africa/Nairobi, US/Hawaii=Pacific/Honolulu, Europe/Ljubljana=Europe/Belgrade, Asia/Vientiane=Asia/Bangkok, Australia/Canberra=Australia/Sydney, US/Mountain=America/Denver, Canada/Yukon=America/Whitehorse, US/Indiana-Starke=America/Indiana/Knox, Etc/GMT+0=Etc/GMT, Portugal=Europe/Lisbon, Africa/Juba=Africa/Khartoum, Africa/Mogadishu=Africa/Nairobi, Asia/Ujung_Pandang=Asia/Makassar, America/St_Vincent=America/Port_of_Spain, W-SU=Europe/Moscow, Asia/Kashgar=Asia/Urumqi, America/St_Kitts=America/Port_of_Spain, Asia/Harbin=Asia/Shanghai, Iran=Asia/Tehran, Asia/Thimbu=Asia/Thimphu, Libya=Africa/Tripoli, UTC=Etc/UTC, Asia/Ashkhabad=Asia/Ashgabat, PNT=America/Phoenix, Asia/Saigon=Asia/Ho_Chi_Minh, Asia/Dacca=Asia/Dhaka, Cuba=America/Havana, Europe/Vaduz=Europe/Zurich, America/Jujuy=America/Argentina/Jujuy, Australia/NSW=Australia/Sydney, Canada/East-Saskatchewan=America/Regina, Pacific/Johnston=Pacific/Honolulu, Europe/Mariehamn=Europe/Helsinki, US/Michigan=America/Detroit, Chile/Continental=America/Santiago, Australia/North=Australia/Darwin, Europe/Sarajevo=Europe/Belgrade, Africa/Banjul=Africa/Abidjan, US/Eastern=America/New_York, America/Fort_Wayne=America/Indiana/Indianapolis, Australia/LHI=Australia/Lord_Howe, Canada/Eastern=America/Toronto, NZ=Pacific/Auckland, Asia/Phnom_Penh=Asia/Bangkok, Arctic/Longyearbyen=Europe/Oslo, Mexico/General=America/Mexico_City, Europe/Skopje=Europe/Belgrade, America/Mendoza=America/Argentina/Mendoza, Africa/Conakry=Africa/Abidjan, America/Montserrat=America/Port_of_Spain, Africa/Lome=Africa/Abidjan, UCT=Etc/UCT, Africa/Brazzaville=Africa/Lagos, Africa/Niamey=Africa/Lagos, America/Knox_IN=America/Indiana/Knox, America/Louisville=America/Kentucky/Louisville, PLT=Asia/Karachi, Africa/Bujumbura=Africa/Maputo, ECT=Europe/Paris, Antarctica/McMurdo=Pacific/Auckland, America/Kralendijk=America/Curacao, America/St_Barthelemy=America/Port_of_Spain, Asia/Chongqing=Asia/Shanghai, Poland=Europe/Warsaw, Africa/Douala=Africa/Lagos, Africa/Malabo=Africa/Lagos, GMT=Etc/GMT, Europe/Tiraspol=Europe/Chisinau, Pacific/Samoa=Pacific/Pago_Pago, Africa/Maseru=Africa/Johannesburg, CTT=Asia/Shanghai, Africa/Kigali=Africa/Maputo, Pacific/Yap=Pacific/Chuuk, Africa/Libreville=Africa/Lagos, US/Arizona=America/Phoenix, US/East-Indiana=America/Indiana/Indianapolis, America/Dominica=America/Port_of_Spain, US/Alaska=America/Anchorage, Africa/Asmera=Africa/Nairobi, EAT=Africa/Nairobi, SST=Pacific/Guadalcanal, Asia/Kuwait=Asia/Riyadh, Asia/Katmandu=Asia/Kathmandu, CST=America/Chicago, Australia/Victoria=Australia/Melbourne, Africa/Kampala=Africa/Nairobi, Asia/Calcutta=Asia/Kolkata, Europe/Vatican=Europe/Rome, US/Aleutian=America/Adak, Africa/Lusaka=Africa/Maputo, Canada/Saskatchewan=America/Regina, Canada/Mountain=America/Edmonton, NZ-CHAT=Pacific/Chatham, Brazil/East=America/Sao_Paulo, Iceland=Atlantic/Reykjavik, Australia/Yancowinna=Australia/Broken_Hill, Asia/Chungking=Asia/Shanghai, Asia/Ulan_Bator=Asia/Ulaanbaatar, Zulu=Etc/UTC, AGT=America/Argentina/Buenos_Aires, Asia/Aden=Asia/Riyadh, Europe/San_Marino=Europe/Rome, BET=America/Sao_Paulo, Israel=Asia/Jerusalem, Australia/Tasmania=Australia/Hobart, Hongkong=Asia/Hong_Kong, America/Aruba=America/Curacao, Asia/Istanbul=Europe/Istanbul, JST=Asia/Tokyo, Africa/Lubumbashi=Africa/Maputo, Asia/Macao=Asia/Macau, BST=Asia/Dhaka, Atlantic/Jan_Mayen=Europe/Oslo, America/Anguilla=America/Port_of_Spain, Africa/Bangui=Africa/Lagos, America/Catamarca=America/Argentina/Catamarca, Indian/Mayotte=Africa/Nairobi, Africa/Sao_Tome=Africa/Abidjan, Europe/Belfast=Europe/London, Brazil/West=America/Manaus, Australia/West=Australia/Perth, America/Grenada=America/Port_of_Spain, Japan=Asia/Tokyo, GMT0=Etc/GMT, Africa/Dar_es_Salaam=Africa/Nairobi, America/Tortola=America/Port_of_Spain, Brazil/DeNoronha=America/Noronha, IET=America/Indiana/Indianapolis, Etc/Zulu=Etc/UTC, AET=Australia/Sydney, Africa/Kinshasa=Africa/Lagos, Africa/Luanda=Africa/Lagos, CAT=Africa/Maputo, IST=Asia/Kolkata, Africa/Porto-Novo=Africa/Lagos, Jamaica=America/Jamaica, Africa/Freetown=Africa/Abidjan, Etc/Greenwich=Etc/GMT, AST=America/Anchorage, Canada/Atlantic=America/Halifax, Europe/Zagreb=Europe/Belgrade, Asia/Muscat=Asia/Dubai, Asia/Bahrain=Asia/Qatar, Europe/Nicosia=Asia/Nicosia, Chile/EasterIsland=Pacific/Easter, Etc/Universal=Etc/UTC, Pacific/Truk=Pacific/Chuuk, Eire=Europe/Dublin, Indian/Comoro=Africa/Nairobi, Turkey=Europe/Istanbul, Europe/Isle_of_Man=Europe/London, GB=Europe/London, Africa/Djibouti=Africa/Nairobi, ART=Africa/Cairo, Etc/GMT0=Etc/GMT, America/Ensenada=America/Tijuana}", 1);
      fail("Expected exception of type java.security.AccessControlException");
    } catch (java.security.AccessControlException e) {
      // Expected exception.
    }

  }

  public void test30() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test30"); }


    java.util.Date var6 = new java.util.Date(1, 100, 1, 10, 1, (-1));
    int var7 = var6.getMinutes();
    long var8 = var6.getTime();

  }

  public void test31() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test31"); }


    sun.util.calendar.ZoneInfo var0 = new sun.util.calendar.ZoneInfo();

  }

  public void test32() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test32"); }


    java.util.TimeZone var0 = java.util.TimeZone.getDefault();
    var0.setID("1 May 1909 04:07:39 GMT");
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test33() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test33"); }


    java.lang.SecurityManager var0 = new java.lang.SecurityManager();
    var0.checkPackageDefinition("");
    java.util.Date var10 = new java.util.Date(1, 100, 1, 10, 1, (-1));
    int var11 = var10.getMinutes();
    java.util.Date var18 = new java.util.Date(1, 100, 1, 10, 1, (-1));
    int var19 = var10.compareTo(var18);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var0.checkRead("1 May 1909 04:07:39 GMT", (java.lang.Object)var18);
      fail("Expected exception of type java.lang.SecurityException");
    } catch (java.lang.SecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var19 == 0);

  }

  public void test34() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test34"); }


    java.util.SimpleTimeZone var13 = new java.util.SimpleTimeZone(100, "1 May 1909 04:07:39 GMT", 1, 0, 100, 100, 10, 0, 0, 10, 0, 1, 100);
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      var13.setStartRule(0, (-1), 0);
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

}
