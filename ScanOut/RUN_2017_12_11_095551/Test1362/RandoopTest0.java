
import junit.framework.*;

public class RandoopTest0 extends TestCase {

  public static boolean debug = false;

  public void test1() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test1"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar((-1), (-1), 10, 1, (-1));
    boolean var6 = var5.isLenient();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == true);

  }

  public void test2() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test2"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.setUseParentHandlers(false);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test3() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test3"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    sun.net.www.MimeEntry var2 = var0.remove("");

  }

  public void test4() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test4"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar((-1), (-1), 10, 1, (-1));
    java.util.Date var6 = var5.getGregorianChange();
    long var7 = var6.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-12219292800000L));

  }

  public void test5() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test5"); }


    sun.util.calendar.Gregorian var0 = sun.util.calendar.CalendarSystem.getGregorianCalendar();
    int var2 = var0.getYearFromFixedDate(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == 1);

  }

  public void test6() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test6"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    java.util.Properties var1 = var0.getAsProperties();
    java.util.Enumeration var2 = var0.elements();
    sun.net.www.MimeEntry var4 = var0.remove("hi!");

  }

  public void test7() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test7"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar((-1), (-1), 10, 1, (-1));
    var5.setMinimalDaysInFirstWeek((-1));
    java.lang.String var8 = var5.toString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var8 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-1,ERA=?,YEAR=-1,MONTH=-1,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=10,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=-1,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"+ "'", var8.equals("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-1,ERA=?,YEAR=-1,MONTH=-1,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=10,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=-1,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]"));

  }

  public void test8() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test8"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      int var2 = var0.getGreatestMinimum((-1));
      fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }

  }

  public void test9() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test9"); }


    sun.util.CoreResourceBundleControl var1 = sun.util.CoreResourceBundleControl.getRBControlInstance("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test10() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test10"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar((-1), (-1), 10, 1, (-1));
    java.util.Date var6 = var5.getGregorianChange();
    int var7 = var6.getTimezoneOffset();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-330));

  }

  public void test11() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test11"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    java.util.Properties var1 = var0.getAsProperties();
    java.util.Properties var2 = var0.getAsProperties();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);

  }

  public void test12() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test12"); }


    sun.util.CoreResourceBundleControl var1 = sun.util.CoreResourceBundleControl.getRBControlInstance("");
    
    // Regression assertion (captures the current behavior of the code)
    assertNull(var1);

  }

  public void test13() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test13"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    int var1 = var0.getMinimalDaysInFirstWeek();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var1 == 1);

  }

  public void test14() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test14"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar((-1), (-1), 10, 1, (-1));
    java.util.Date var6 = var5.getGregorianChange();
    java.util.Date var7 = var5.getTime();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var7);

  }

  public void test15() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test15"); }


    sun.util.CoreResourceBundleControl var0 = sun.util.CoreResourceBundleControl.getRBControlInstance();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test16() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test16"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    var0.load();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test17() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test17"); }


    java.util.Hashtable var1 = new java.util.Hashtable(1);

  }

  public void test18() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test18"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar((-1), (-1), 10, 1, (-1));
    java.util.Date var6 = var5.getGregorianChange();
    int var7 = var5.getWeekYear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var6);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var7 == (-2));

  }

  public void test19() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test19"); }


    java.util.Date var5 = new java.util.Date(10, 10, 1, 0, (-1));
    java.lang.String var6 = var5.toLocaleString();
    var5.setMinutes(100);

  }

  public void test20() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test20"); }


    com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl var0 = new com.sun.org.apache.xerces.internal.jaxp.datatype.DatatypeFactoryImpl();
    javax.xml.datatype.Duration var2 = var0.newDurationDayTime(1L);
    javax.xml.datatype.Duration var4 = var0.newDuration(1L);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var2);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test21() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test21"); }


    java.util.logging.Logger var0 = java.util.logging.Logger.getGlobal();
    var0.exiting("hi!", "{application/x-shar=action=save; file_extensions=.sh,.shar; description=Shell Archive, application/xml=file_extensions=.xml; description=XML document, application/x-cpio=action=save; file_extensions=.cpio; description=Unix CPIO Archive, video/quicktime=file_extensions=.mov,.qt; description=QuickTime Video Clip, video/mpeg=action=application; application=mpeg_play %s; icon=null.gif; file_extensions=.mpg,.mpe,.mpeg; description=MPEG Video Clip, video/x-sgi-movie=file_extensions=.movie,.mv; description=SGI Movie, application/x-netcdf=action=save; file_extensions=.nc,.cdf; description=Unidata netCDF Data Format, image/x-xbitmap=file_extensions=.xbm,.xpm; description=X Bitmap Image, application/octet-stream=file_extensions=.saveme,.dump,.hqx,.arc,.o,.a,.bin,.exe,.z,.gz; description=Generic Binary Stream, application/x-dvi=action=application; application=xdvi %s; file_extensions=.dvi; description=TeX DVI File, audio/x-wav=icon=null.gif; file_extensions=.wav; description=Wav Audio, message/rfc822=file_extensions=.mime; description=Internet Email Message, application/x-gtar=action=save; icon=null.gif; file_extensions=.gtar; description=Gnu Tar Archive, application/zip=action=save; icon=null.gif; file_extensions=.zip; description=Zip File, image/x-portable-anymap=file_extensions=.pnm; description=PBM Anymap Format, application/x-sv4cpio=action=save; file_extensions=.sv4cpio; description=SVR4 CPIO Archive, application/x-sv4crc=action=save; file_extensions=.sv4crc; description=SVR4 CPIO with CRC, application/x-ustar=action=save; file_extensions=.ustar; description=US Tar Archive, application/x-wais-source=file_extensions=.src,.wsrc; description=Wais Source, image/x-portable-bitmap=file_extensions=.pbm; description=PBM Bitmap Format, application/x-latex=file_extensions=.latex; description=LaTeX Source, audio/x-aiff=icon=null.gif; file_extensions=.aifc,.aif,.aiff; description=Audio Interchange Format File, image/tiff=icon=null.gif; file_extensions=.tif,.tiff; description=TIFF Image, image/gif=action=browser; icon=null.gif; file_extensions=.gif; description=GIF Image, application/x-bcpio=action=save; file_extensions=.bcpio; description=Old Binary CPIO Archive, image/vnd.fpx=file_extensions=.fpx,.fpix; description=FlashPix Image, image/x-rgb=file_extensions=.rgb; description=RGB Image, application/x-troff=action=application; application=xterm -title troff -e sh -c \"nroff %s | col | more -w\"; file_extensions=.t,.tr,.roff; description=Troff Source, application/x-texinfo=file_extensions=.texinfo,.texi; description=Gnu Texinfo, application/x-troff-ms=action=application; application=xterm -title troff -e sh -c \"nroff -ms %s | col | more -w\"; file_extensions=.ms; description=Troff MS Macros, audio/basic=action=application; application=audiotool %s; icon=null.gif; file_extensions=.snd,.au; description=Basic Audio, unknown/unknown=description=Unknown Data Type, application/x-troff-msvideo=icon=null.gif; file_extensions=.avi; description=AVI Video, application/x-tex=file_extensions=.tex; description=TeX Source, text/tab-separated-values=file_extensions=.tsv; description=Tab Separated Values Text, content/unknown=description=Unknown Content, application/x-troff-me=action=application; application=xterm -title troff -e sh -c \"nroff -me %s | col | more -w\"; file_extensions=.me; description=Troff ME Macros, text/x-setext=file_extensions=.etx; description=Structure Enhanced Text, image/bmp=file_extensions=.bmp; description=Bitmap Image, application/oda=file_extensions=.oda; description=ODA Document, image/x-cmu-rast=file_extensions=.ras; description=CMU Raster Image, application/pdf=file_extensions=.pdf; description=Adobe PDF Format, image/x-portable-pixmap=file_extensions=.ppm; description=PBM Pixmap Format, application/x-troff-man=action=application; application=xterm -title troff -e sh -c \"nroff -man %s | col | more -w\"; file_extensions=.man; description=Troff Manpage Source, image/ief=file_extensions=.ief; description=Image Exchange Format, application/x-tar=action=save; icon=null.gif; file_extensions=.tar; description=Tar Archive, text/plain=action=browser; icon=null.gif; file_extensions=.text,.c,.cc,.c++,.h,.pl,.txt,.java,.el; description=Plain Text, application/x-hdf=action=save; file_extensions=.hdf; description=Hierarchical Data Format, image/jpeg=action=browser; application=imagetool %s; icon=null.gif; file_extensions=.jfif,.jfif-tbnl,.jpe,.jpg,.jpeg; description=JPEG Image, application/postscript=action=application; application=imagetool %s; icon=null.gif; file_extensions=.eps,.ai,.ps; description=Postscript File, image/x-portable-graymap=file_extensions=.pgm; description=PBM Graymap Format, image/x-xwindowdump=file_extensions=.xwd; description=X Window Dump Image, image/png=action=browser; icon=null.gif; file_extensions=.png; description=PNG Image, text/html=icon=null.gif; file_extensions=.htm,.html; description=HTML Document}", (java.lang.Object)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);

  }

  public void test22() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test22"); }


    java.util.GregorianCalendar var5 = new java.util.GregorianCalendar((-1), (-1), 10, 1, (-1));
    long var6 = var5.getTimeInMillis();
    java.util.Date var12 = new java.util.Date(10, 10, 1, 0, (-1));
    java.lang.String var13 = var12.toLocaleString();
    var5.setGregorianChange(var12);
    java.lang.String var15 = var12.toGMTString();
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var6 == (-62200845060000L));

  }

  public void test23() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test23"); }


    java.util.logging.Logger var1 = java.util.logging.Logger.getLogger("31 Oct, 1910 11:59:00 PM");
    boolean var2 = var1.getUseParentHandlers();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue(var2 == true);

  }

  public void test24() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test24"); }


    sun.net.www.MimeTable var0 = sun.net.www.MimeTable.getDefaultTable();
    java.util.Properties var1 = var0.getAsProperties();
    java.util.Hashtable var2 = new java.util.Hashtable((java.util.Map)var1);
    java.lang.String var3 = var2.toString();
    java.lang.Object var4 = var2.clone();
    var2.clear();
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var0);
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var1);
    
    // Regression assertion (captures the current behavior of the code)
    assertTrue("'" + var3 + "' != '" + "{application/x-shar=action=save; file_extensions=.sh,.shar; description=Shell Archive, application/xml=file_extensions=.xml; description=XML document, application/x-cpio=action=save; file_extensions=.cpio; description=Unix CPIO Archive, video/quicktime=file_extensions=.mov,.qt; description=QuickTime Video Clip, video/mpeg=action=application; application=mpeg_play %s; icon=null.gif; file_extensions=.mpg,.mpe,.mpeg; description=MPEG Video Clip, video/x-sgi-movie=file_extensions=.movie,.mv; description=SGI Movie, application/x-netcdf=action=save; file_extensions=.nc,.cdf; description=Unidata netCDF Data Format, image/x-xbitmap=file_extensions=.xbm,.xpm; description=X Bitmap Image, application/octet-stream=file_extensions=.saveme,.dump,.hqx,.arc,.o,.a,.bin,.exe,.z,.gz; description=Generic Binary Stream, application/x-dvi=action=application; application=xdvi %s; file_extensions=.dvi; description=TeX DVI File, audio/x-wav=icon=null.gif; file_extensions=.wav; description=Wav Audio, message/rfc822=file_extensions=.mime; description=Internet Email Message, application/x-gtar=action=save; icon=null.gif; file_extensions=.gtar; description=Gnu Tar Archive, application/zip=action=save; icon=null.gif; file_extensions=.zip; description=Zip File, image/x-portable-anymap=file_extensions=.pnm; description=PBM Anymap Format, application/x-sv4cpio=action=save; file_extensions=.sv4cpio; description=SVR4 CPIO Archive, application/x-sv4crc=action=save; file_extensions=.sv4crc; description=SVR4 CPIO with CRC, application/x-ustar=action=save; file_extensions=.ustar; description=US Tar Archive, application/x-wais-source=file_extensions=.src,.wsrc; description=Wais Source, image/x-portable-bitmap=file_extensions=.pbm; description=PBM Bitmap Format, application/x-latex=file_extensions=.latex; description=LaTeX Source, audio/x-aiff=icon=null.gif; file_extensions=.aifc,.aif,.aiff; description=Audio Interchange Format File, image/tiff=icon=null.gif; file_extensions=.tif,.tiff; description=TIFF Image, image/gif=action=browser; icon=null.gif; file_extensions=.gif; description=GIF Image, application/x-bcpio=action=save; file_extensions=.bcpio; description=Old Binary CPIO Archive, image/vnd.fpx=file_extensions=.fpx,.fpix; description=FlashPix Image, image/x-rgb=file_extensions=.rgb; description=RGB Image, application/x-troff=action=application; application=xterm -title troff -e sh -c \"nroff %s | col | more -w\"; file_extensions=.t,.tr,.roff; description=Troff Source, application/x-texinfo=file_extensions=.texinfo,.texi; description=Gnu Texinfo, application/x-troff-ms=action=application; application=xterm -title troff -e sh -c \"nroff -ms %s | col | more -w\"; file_extensions=.ms; description=Troff MS Macros, audio/basic=action=application; application=audiotool %s; icon=null.gif; file_extensions=.snd,.au; description=Basic Audio, unknown/unknown=description=Unknown Data Type, application/x-troff-msvideo=icon=null.gif; file_extensions=.avi; description=AVI Video, application/x-tex=file_extensions=.tex; description=TeX Source, text/tab-separated-values=file_extensions=.tsv; description=Tab Separated Values Text, content/unknown=description=Unknown Content, application/x-troff-me=action=application; application=xterm -title troff -e sh -c \"nroff -me %s | col | more -w\"; file_extensions=.me; description=Troff ME Macros, text/x-setext=file_extensions=.etx; description=Structure Enhanced Text, image/bmp=file_extensions=.bmp; description=Bitmap Image, application/oda=file_extensions=.oda; description=ODA Document, image/x-cmu-rast=file_extensions=.ras; description=CMU Raster Image, application/pdf=file_extensions=.pdf; description=Adobe PDF Format, image/x-portable-pixmap=file_extensions=.ppm; description=PBM Pixmap Format, application/x-troff-man=action=application; application=xterm -title troff -e sh -c \"nroff -man %s | col | more -w\"; file_extensions=.man; description=Troff Manpage Source, image/ief=file_extensions=.ief; description=Image Exchange Format, application/x-tar=action=save; icon=null.gif; file_extensions=.tar; description=Tar Archive, text/plain=action=browser; icon=null.gif; file_extensions=.text,.c,.cc,.c++,.h,.pl,.txt,.java,.el; description=Plain Text, application/x-hdf=action=save; file_extensions=.hdf; description=Hierarchical Data Format, image/jpeg=action=browser; application=imagetool %s; icon=null.gif; file_extensions=.jfif,.jfif-tbnl,.jpe,.jpg,.jpeg; description=JPEG Image, application/postscript=action=application; application=imagetool %s; icon=null.gif; file_extensions=.eps,.ai,.ps; description=Postscript File, image/x-portable-graymap=file_extensions=.pgm; description=PBM Graymap Format, image/x-xwindowdump=file_extensions=.xwd; description=X Window Dump Image, image/png=action=browser; icon=null.gif; file_extensions=.png; description=PNG Image, text/html=icon=null.gif; file_extensions=.htm,.html; description=HTML Document}"+ "'", var3.equals("{application/x-shar=action=save; file_extensions=.sh,.shar; description=Shell Archive, application/xml=file_extensions=.xml; description=XML document, application/x-cpio=action=save; file_extensions=.cpio; description=Unix CPIO Archive, video/quicktime=file_extensions=.mov,.qt; description=QuickTime Video Clip, video/mpeg=action=application; application=mpeg_play %s; icon=null.gif; file_extensions=.mpg,.mpe,.mpeg; description=MPEG Video Clip, video/x-sgi-movie=file_extensions=.movie,.mv; description=SGI Movie, application/x-netcdf=action=save; file_extensions=.nc,.cdf; description=Unidata netCDF Data Format, image/x-xbitmap=file_extensions=.xbm,.xpm; description=X Bitmap Image, application/octet-stream=file_extensions=.saveme,.dump,.hqx,.arc,.o,.a,.bin,.exe,.z,.gz; description=Generic Binary Stream, application/x-dvi=action=application; application=xdvi %s; file_extensions=.dvi; description=TeX DVI File, audio/x-wav=icon=null.gif; file_extensions=.wav; description=Wav Audio, message/rfc822=file_extensions=.mime; description=Internet Email Message, application/x-gtar=action=save; icon=null.gif; file_extensions=.gtar; description=Gnu Tar Archive, application/zip=action=save; icon=null.gif; file_extensions=.zip; description=Zip File, image/x-portable-anymap=file_extensions=.pnm; description=PBM Anymap Format, application/x-sv4cpio=action=save; file_extensions=.sv4cpio; description=SVR4 CPIO Archive, application/x-sv4crc=action=save; file_extensions=.sv4crc; description=SVR4 CPIO with CRC, application/x-ustar=action=save; file_extensions=.ustar; description=US Tar Archive, application/x-wais-source=file_extensions=.src,.wsrc; description=Wais Source, image/x-portable-bitmap=file_extensions=.pbm; description=PBM Bitmap Format, application/x-latex=file_extensions=.latex; description=LaTeX Source, audio/x-aiff=icon=null.gif; file_extensions=.aifc,.aif,.aiff; description=Audio Interchange Format File, image/tiff=icon=null.gif; file_extensions=.tif,.tiff; description=TIFF Image, image/gif=action=browser; icon=null.gif; file_extensions=.gif; description=GIF Image, application/x-bcpio=action=save; file_extensions=.bcpio; description=Old Binary CPIO Archive, image/vnd.fpx=file_extensions=.fpx,.fpix; description=FlashPix Image, image/x-rgb=file_extensions=.rgb; description=RGB Image, application/x-troff=action=application; application=xterm -title troff -e sh -c \"nroff %s | col | more -w\"; file_extensions=.t,.tr,.roff; description=Troff Source, application/x-texinfo=file_extensions=.texinfo,.texi; description=Gnu Texinfo, application/x-troff-ms=action=application; application=xterm -title troff -e sh -c \"nroff -ms %s | col | more -w\"; file_extensions=.ms; description=Troff MS Macros, audio/basic=action=application; application=audiotool %s; icon=null.gif; file_extensions=.snd,.au; description=Basic Audio, unknown/unknown=description=Unknown Data Type, application/x-troff-msvideo=icon=null.gif; file_extensions=.avi; description=AVI Video, application/x-tex=file_extensions=.tex; description=TeX Source, text/tab-separated-values=file_extensions=.tsv; description=Tab Separated Values Text, content/unknown=description=Unknown Content, application/x-troff-me=action=application; application=xterm -title troff -e sh -c \"nroff -me %s | col | more -w\"; file_extensions=.me; description=Troff ME Macros, text/x-setext=file_extensions=.etx; description=Structure Enhanced Text, image/bmp=file_extensions=.bmp; description=Bitmap Image, application/oda=file_extensions=.oda; description=ODA Document, image/x-cmu-rast=file_extensions=.ras; description=CMU Raster Image, application/pdf=file_extensions=.pdf; description=Adobe PDF Format, image/x-portable-pixmap=file_extensions=.ppm; description=PBM Pixmap Format, application/x-troff-man=action=application; application=xterm -title troff -e sh -c \"nroff -man %s | col | more -w\"; file_extensions=.man; description=Troff Manpage Source, image/ief=file_extensions=.ief; description=Image Exchange Format, application/x-tar=action=save; icon=null.gif; file_extensions=.tar; description=Tar Archive, text/plain=action=browser; icon=null.gif; file_extensions=.text,.c,.cc,.c++,.h,.pl,.txt,.java,.el; description=Plain Text, application/x-hdf=action=save; file_extensions=.hdf; description=Hierarchical Data Format, image/jpeg=action=browser; application=imagetool %s; icon=null.gif; file_extensions=.jfif,.jfif-tbnl,.jpe,.jpg,.jpeg; description=JPEG Image, application/postscript=action=application; application=imagetool %s; icon=null.gif; file_extensions=.eps,.ai,.ps; description=Postscript File, image/x-portable-graymap=file_extensions=.pgm; description=PBM Graymap Format, image/x-xwindowdump=file_extensions=.xwd; description=X Window Dump Image, image/png=action=browser; icon=null.gif; file_extensions=.png; description=PNG Image, text/html=icon=null.gif; file_extensions=.htm,.html; description=HTML Document}"));
    
    // Regression assertion (captures the current behavior of the code)
    assertNotNull(var4);

  }

  public void test25() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test25"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Date var1 = new java.util.Date("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Asia/Kolkata\",offset=19800000,dstSavings=0,useDaylight=false,transitions=6,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=-1,ERA=?,YEAR=-1,MONTH=-1,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=10,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=0,HOUR=1,HOUR_OF_DAY=1,MINUTE=-1,SECOND=0,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  public void test26() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test26"); }


    java.util.GregorianCalendar var0 = new java.util.GregorianCalendar();
    var0.set(100, 100, 10);

  }

  public void test27() throws Throwable {

    if (debug) { System.out.println(); System.out.print("RandoopTest0.test27"); }


    // The following exception was thrown during execution.
    // This behavior will recorded for regression testing.
    try {
      java.util.Hashtable var1 = new java.util.Hashtable((-1));
      fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

}
