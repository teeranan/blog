/* The following code was generated by JFlex 1.4.3 on 7/12/12 7:58 PM */

/**
 * Copyright (c) 2005, Regents of the University of California
 * All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * * Redistributions of source code must retain the above copyright
 *   notice, this list of conditions and the following disclaimer.
 *
 * * Redistributions in binary form must reproduce the above copyright
 *   notice, this list of conditions and the following disclaimer in
 *   the documentation and/or other materials provided with the
 *   distribution.  
 *
 * * Neither the name of the University of California, Berkeley nor
 *   the names of its contributors may be used to endorse or promote
 *   products derived from this software without specific prior 
 *   written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS
 * "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT
 * LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS
 * FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT,
 * INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES
 * (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 * SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT,
 * STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED
 * OF THE POSSIBILITY OF SUCH DAMAGE.
 */
 
/**
 * Using JFlex-1.4.3
 * @author leili
 */ 
package blog.parse;
import java_cup.runtime.*;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 7/12/12 7:58 PM from the specification file
 * <tt>src/blog/parse/BLOGLexer.flex</tt>
 */
public class BLOGLexer implements ScannerWithLocInfo, java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int CHAR_LIT = 4;
  public static final int YYINITIAL = 0;
  public static final int STR_LIT = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\10\1\102\1\0\1\10\1\7\22\0\1\10\1\61\1\16"+
    "\1\77\1\0\1\55\1\62\1\17\1\65\1\66\1\15\1\54\1\75"+
    "\1\4\1\5\1\14\4\12\4\11\2\2\1\74\1\73\1\56\1\60"+
    "\1\57\1\0\1\64\1\24\1\13\1\37\1\26\1\6\1\31\1\34"+
    "\1\40\1\32\2\1\1\41\1\30\1\25\1\27\1\22\1\42\1\23"+
    "\1\36\1\20\1\35\2\1\1\33\1\21\1\1\1\71\1\100\1\72"+
    "\1\0\1\3\1\0\1\50\1\101\1\37\1\26\1\46\1\47\1\34"+
    "\1\40\1\32\2\1\1\51\1\30\1\53\1\27\1\22\1\42\1\44"+
    "\1\52\1\43\1\45\2\1\1\33\1\21\1\1\1\70\1\63\1\67"+
    "\1\76\uff81\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\1\4\1\5\1\2\1\6"+
    "\1\7\1\10\1\11\1\12\16\2\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\1\33\1\34\1\35"+
    "\1\36\1\37\1\40\1\41\1\37\1\42\1\43\1\0"+
    "\1\3\1\44\2\2\1\45\1\0\14\2\1\46\6\2"+
    "\1\47\1\50\1\51\1\52\1\53\2\54\1\55\1\56"+
    "\1\57\1\60\1\53\1\61\1\62\1\63\1\64\1\43"+
    "\1\0\2\2\1\45\1\0\7\2\1\65\1\2\1\66"+
    "\1\2\1\67\7\2\1\54\1\0\1\2\1\70\1\71"+
    "\1\72\15\2\1\73\1\2\1\74\1\0\2\2\1\75"+
    "\10\2\1\76\2\2\1\77\1\100\1\0\1\101\1\102"+
    "\1\2\1\103\3\2\1\104\1\105\1\106\2\2\1\107"+
    "\11\2\1\110\2\2\1\111\4\2\1\112";

  private static int [] zzUnpackAction() {
    int [] result = new int[192];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\103\0\206\0\311\0\u010c\0\u014f\0\u0192\0\u01d5"+
    "\0\u0218\0\311\0\u025b\0\311\0\311\0\311\0\u029e\0\u02e1"+
    "\0\u0324\0\u0367\0\u03aa\0\u03ed\0\u0430\0\u0473\0\u04b6\0\u04f9"+
    "\0\u053c\0\u057f\0\u05c2\0\u0605\0\u0648\0\311\0\u068b\0\u06ce"+
    "\0\u0711\0\u0754\0\311\0\311\0\311\0\311\0\311\0\311"+
    "\0\311\0\311\0\311\0\311\0\311\0\311\0\311\0\311"+
    "\0\311\0\311\0\311\0\u0797\0\311\0\u07da\0\u081d\0\u0648"+
    "\0\311\0\u0860\0\u08a3\0\u08e6\0\u0929\0\u096c\0\u09af\0\u09f2"+
    "\0\u0a35\0\u0a78\0\u0abb\0\u0afe\0\u0b41\0\u0b84\0\u0bc7\0\u0c0a"+
    "\0\u0c4d\0\u010c\0\u0c90\0\u0cd3\0\u0d16\0\u0d59\0\u0d9c\0\u0ddf"+
    "\0\311\0\311\0\311\0\311\0\311\0\u0e22\0\u0e65\0\311"+
    "\0\311\0\311\0\311\0\u0ea8\0\311\0\311\0\311\0\311"+
    "\0\u0eeb\0\u0eeb\0\u0f2e\0\u0f71\0\311\0\u0fb4\0\u0ff7\0\u103a"+
    "\0\u107d\0\u10c0\0\u1103\0\u1146\0\u1189\0\u010c\0\u11cc\0\u010c"+
    "\0\u120f\0\u1252\0\u1295\0\u12d8\0\u131b\0\u135e\0\u13a1\0\u13e4"+
    "\0\u1427\0\311\0\u146a\0\u14ad\0\u14f0\0\u010c\0\u010c\0\u1533"+
    "\0\u1576\0\u15b9\0\u15fc\0\u163f\0\u1682\0\u16c5\0\u1708\0\u174b"+
    "\0\u178e\0\u17d1\0\u1814\0\u1857\0\u010c\0\u189a\0\u010c\0\u18dd"+
    "\0\u1920\0\u1963\0\u010c\0\u19a6\0\u19e9\0\u1a2c\0\u1a6f\0\u1ab2"+
    "\0\u1af5\0\u1b38\0\u1b7b\0\u010c\0\u1bbe\0\u1c01\0\u010c\0\u010c"+
    "\0\u1c44\0\u010c\0\u010c\0\u1c87\0\u010c\0\u1cca\0\u1d0d\0\u1d50"+
    "\0\u010c\0\u010c\0\u010c\0\u1d93\0\u1dd6\0\311\0\u1e19\0\u1e5c"+
    "\0\u1e9f\0\u1ee2\0\u1f25\0\u1f68\0\u1fab\0\u1fee\0\u2031\0\u010c"+
    "\0\u2074\0\u20b7\0\u010c\0\u20fa\0\u213d\0\u2180\0\u21c3\0\u010c";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[192];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\1\5\1\6\1\4\1\7\1\10\1\11\2\12"+
    "\2\6\1\5\1\13\1\14\1\15\1\16\1\17\1\5"+
    "\1\20\1\21\1\5\1\22\1\23\1\24\1\25\1\26"+
    "\1\27\1\5\1\30\5\5\1\31\1\32\1\21\1\5"+
    "\1\11\1\33\3\5\1\34\1\35\1\36\1\37\1\40"+
    "\1\41\1\42\1\43\1\44\1\45\1\46\1\47\1\50"+
    "\1\51\1\52\1\53\1\54\1\55\1\56\1\57\1\60"+
    "\1\4\1\5\1\12\7\61\1\62\6\61\1\63\61\61"+
    "\1\64\1\61\1\62\7\61\1\62\7\61\1\65\60\61"+
    "\1\64\1\61\1\62\104\0\3\5\2\0\1\5\2\0"+
    "\3\5\4\0\34\5\25\0\1\5\3\0\1\6\2\0"+
    "\1\66\1\67\2\0\2\6\33\0\1\67\36\0\1\70"+
    "\6\0\2\70\44\0\1\71\25\0\1\66\6\0\2\66"+
    "\71\0\3\5\2\0\1\5\2\0\3\5\4\0\13\5"+
    "\1\72\5\5\1\73\7\5\1\73\2\5\25\0\1\5"+
    "\15\0\1\74\1\75\66\0\3\5\2\0\1\5\2\0"+
    "\3\5\4\0\1\5\1\76\16\5\1\77\13\5\25\0"+
    "\1\5\2\0\3\5\2\0\1\5\2\0\3\5\4\0"+
    "\4\5\1\100\23\5\1\100\3\5\25\0\1\5\2\0"+
    "\3\5\2\0\1\5\2\0\3\5\4\0\4\5\1\101"+
    "\23\5\1\101\3\5\25\0\1\5\2\0\3\5\2\0"+
    "\1\5\2\0\3\5\4\0\7\5\1\102\24\5\25\0"+
    "\1\5\2\0\3\5\2\0\1\5\2\0\3\5\4\0"+
    "\12\5\1\103\21\5\25\0\1\5\2\0\3\5\2\0"+
    "\1\5\2\0\2\5\1\104\4\0\3\5\1\105\20\5"+
    "\1\105\7\5\25\0\1\104\2\0\3\5\2\0\1\5"+
    "\2\0\3\5\4\0\4\5\1\106\23\5\1\106\3\5"+
    "\25\0\1\5\2\0\3\5\2\0\1\5\2\0\3\5"+
    "\4\0\4\5\1\107\2\5\1\110\2\5\1\111\15\5"+
    "\1\107\3\5\25\0\1\5\2\0\3\5\2\0\1\5"+
    "\2\0\3\5\4\0\11\5\1\112\15\5\1\112\4\5"+
    "\25\0\1\5\2\0\3\5\2\0\1\113\2\0\3\5"+
    "\4\0\15\5\1\114\7\5\1\114\1\113\5\5\25\0"+
    "\1\5\2\0\3\5\2\0\1\5\2\0\3\5\4\0"+
    "\15\5\1\115\7\5\1\115\6\5\25\0\1\5\2\0"+
    "\3\5\2\0\1\5\2\0\3\5\4\0\1\5\1\76"+
    "\16\5\1\77\3\5\1\116\7\5\25\0\1\5\2\0"+
    "\3\5\2\0\1\5\2\0\3\5\4\0\4\5\1\107"+
    "\2\5\1\110\2\5\1\111\15\5\1\117\3\5\25\0"+
    "\1\5\2\0\3\5\2\0\1\5\2\0\3\5\4\0"+
    "\7\5\1\102\15\5\1\120\6\5\25\0\1\5\3\0"+
    "\1\70\6\0\2\70\150\0\1\121\102\0\1\122\102\0"+
    "\1\123\102\0\1\124\22\0\11\125\1\126\1\127\3\125"+
    "\1\130\1\131\23\125\1\132\1\133\1\134\1\125\1\135"+
    "\3\125\1\136\24\125\1\137\1\140\3\0\1\66\3\0"+
    "\1\67\2\0\2\66\33\0\1\67\36\0\1\141\1\0"+
    "\1\142\4\0\2\141\41\0\1\142\27\0\3\5\2\0"+
    "\1\5\2\0\3\5\4\0\12\5\1\143\21\5\25\0"+
    "\1\5\2\0\3\5\2\0\1\5\2\0\3\5\4\0"+
    "\16\5\1\144\13\5\1\144\1\5\25\0\1\5\1\0"+
    "\7\74\1\145\72\74\1\145\15\75\1\146\65\75\1\0"+
    "\3\5\2\0\1\5\2\0\3\5\4\0\2\5\1\147"+
    "\31\5\25\0\1\5\2\0\3\5\2\0\1\150\2\0"+
    "\3\5\4\0\26\5\1\150\5\5\25\0\1\5\2\0"+
    "\3\5\2\0\1\5\2\0\3\5\4\0\3\5\1\151"+
    "\20\5\1\151\7\5\25\0\1\5\2\0\3\5\2\0"+
    "\1\5\2\0\3\5\4\0\5\5\1\152\25\5\1\152"+
    "\25\0\1\5\2\0\3\5\2\0\1\5\2\0\3\5"+
    "\4\0\5\5\1\153\25\5\1\153\25\0\1\5\2\0"+
    "\3\5\2\0\1\5\2\0\3\5\4\0\1\154\15\5"+
    "\1\155\4\5\1\154\6\5\1\155\1\5\25\0\1\5"+
    "\2\0\3\5\2\0\1\5\2\0\3\5\4\0\16\5"+
    "\1\156\13\5\1\156\1\5\25\0\1\5\2\0\3\5"+
    "\2\0\1\5\2\0\3\5\4\0\12\5\1\157\21\5"+
    "\25\0\1\5\2\0\3\5\2\0\1\5\2\0\3\5"+
    "\4\0\2\5\1\160\31\5\25\0\1\5\2\0\3\5"+
    "\2\0\1\5\2\0\3\5\4\0\17\5\1\161\14\5"+
    "\25\0\1\5\2\0\3\5\2\0\1\5\2\0\3\5"+
    "\4\0\3\5\1\162\20\5\1\162\7\5\25\0\1\5"+
    "\2\0\3\5\2\0\1\5\2\0\3\5\4\0\13\5"+
    "\1\163\20\5\25\0\1\5\2\0\3\5\2\0\1\5"+
    "\2\0\3\5\4\0\5\5\1\164\25\5\1\164\25\0"+
    "\1\5\2\0\3\5\2\0\1\5\2\0\3\5\4\0"+
    "\4\5\1\165\23\5\1\165\3\5\25\0\1\5\2\0"+
    "\3\5\2\0\1\166\2\0\3\5\4\0\26\5\1\166"+
    "\5\5\25\0\1\5\2\0\3\5\2\0\1\5\2\0"+
    "\3\5\4\0\25\5\1\167\6\5\25\0\1\5\2\0"+
    "\3\5\2\0\1\5\2\0\3\5\4\0\17\5\1\161"+
    "\11\5\1\170\2\5\25\0\1\5\2\0\3\5\2\0"+
    "\1\5\2\0\3\5\4\0\31\5\1\171\2\5\25\0"+
    "\1\5\12\0\2\172\101\0\2\126\72\0\1\173\3\0"+
    "\1\173\2\0\3\173\10\0\1\173\1\0\1\173\2\0"+
    "\1\173\5\0\1\173\6\0\3\173\30\0\1\173\3\0"+
    "\1\141\6\0\2\141\71\0\3\5\2\0\1\5\2\0"+
    "\3\5\4\0\16\5\1\174\13\5\1\174\1\5\25\0"+
    "\1\5\2\0\3\5\2\0\1\175\2\0\3\5\4\0"+
    "\26\5\1\175\5\5\25\0\1\5\1\0\14\75\1\145"+
    "\1\146\65\75\1\0\3\5\2\0\1\176\2\0\3\5"+
    "\4\0\26\5\1\176\5\5\25\0\1\5\2\0\3\5"+
    "\2\0\1\5\2\0\3\5\4\0\5\5\1\177\25\5"+
    "\1\177\25\0\1\5\2\0\3\5\2\0\1\5\2\0"+
    "\3\5\4\0\4\5\1\200\4\5\1\201\15\5\1\201"+
    "\1\200\3\5\25\0\1\5\2\0\3\5\2\0\1\5"+
    "\2\0\3\5\4\0\6\5\1\202\25\5\25\0\1\5"+
    "\2\0\3\5\2\0\1\5\2\0\3\5\4\0\3\5"+
    "\1\203\20\5\1\203\7\5\25\0\1\5\2\0\3\5"+
    "\2\0\1\5\2\0\3\5\4\0\3\5\1\204\20\5"+
    "\1\204\7\5\25\0\1\5\2\0\3\5\2\0\1\5"+
    "\2\0\3\5\4\0\1\205\22\5\1\205\10\5\25\0"+
    "\1\5\2\0\3\5\2\0\1\5\2\0\3\5\4\0"+
    "\14\5\1\206\17\5\25\0\1\5\2\0\3\5\2\0"+
    "\1\5\2\0\3\5\4\0\1\207\22\5\1\207\10\5"+
    "\25\0\1\5\2\0\3\5\2\0\1\5\2\0\3\5"+
    "\4\0\4\5\1\210\23\5\1\210\3\5\25\0\1\5"+
    "\2\0\3\5\2\0\1\211\2\0\3\5\4\0\26\5"+
    "\1\211\5\5\25\0\1\5\2\0\3\5\2\0\1\212"+
    "\2\0\3\5\4\0\26\5\1\212\5\5\25\0\1\5"+
    "\2\0\3\5\2\0\1\5\2\0\3\5\4\0\3\5"+
    "\1\213\20\5\1\213\7\5\25\0\1\5\2\0\3\5"+
    "\2\0\1\5\2\0\3\5\4\0\3\5\1\214\20\5"+
    "\1\214\7\5\25\0\1\5\2\0\3\5\2\0\1\5"+
    "\2\0\3\5\4\0\26\5\1\215\5\5\25\0\1\5"+
    "\2\0\3\5\2\0\1\5\2\0\3\5\4\0\32\5"+
    "\1\216\1\5\25\0\1\5\2\0\3\5\2\0\1\5"+
    "\2\0\3\5\4\0\31\5\1\217\2\5\25\0\1\5"+
    "\3\0\1\220\3\0\1\220\2\0\3\220\10\0\1\220"+
    "\1\0\1\220\2\0\1\220\5\0\1\220\6\0\3\220"+
    "\30\0\1\220\2\0\3\5\2\0\1\5\2\0\3\5"+
    "\4\0\1\221\22\5\1\221\10\5\25\0\1\5\2\0"+
    "\3\5\2\0\1\5\2\0\3\5\4\0\12\5\1\222"+
    "\21\5\25\0\1\5\2\0\3\5\2\0\1\5\2\0"+
    "\3\5\4\0\10\5\1\223\23\5\25\0\1\5\2\0"+
    "\3\5\2\0\1\5\2\0\3\5\4\0\4\5\1\224"+
    "\23\5\1\224\3\5\25\0\1\5\2\0\3\5\2\0"+
    "\1\5\2\0\3\5\4\0\7\5\1\225\24\5\25\0"+
    "\1\5\2\0\3\5\2\0\1\5\2\0\3\5\4\0"+
    "\4\5\1\226\23\5\1\226\3\5\25\0\1\5\2\0"+
    "\3\5\2\0\1\5\2\0\3\5\4\0\12\5\1\227"+
    "\21\5\25\0\1\5\2\0\3\5\2\0\1\5\2\0"+
    "\3\5\4\0\12\5\1\230\21\5\25\0\1\5\2\0"+
    "\3\5\2\0\1\5\2\0\3\5\4\0\12\5\1\231"+
    "\21\5\25\0\1\5\2\0\3\5\2\0\1\5\2\0"+
    "\3\5\4\0\7\5\1\232\24\5\25\0\1\5\2\0"+
    "\3\5\2\0\1\5\2\0\3\5\4\0\21\5\1\233"+
    "\7\5\1\233\2\5\25\0\1\5\2\0\3\5\2\0"+
    "\1\5\2\0\3\5\4\0\6\5\1\234\25\5\25\0"+
    "\1\5\2\0\3\5\2\0\1\5\2\0\3\5\4\0"+
    "\3\5\1\235\20\5\1\235\7\5\25\0\1\5\2\0"+
    "\3\5\2\0\1\5\2\0\3\5\4\0\4\5\1\236"+
    "\23\5\1\236\3\5\25\0\1\5\2\0\3\5\2\0"+
    "\1\5\2\0\3\5\4\0\1\5\1\237\32\5\25\0"+
    "\1\5\2\0\3\5\2\0\1\5\2\0\3\5\4\0"+
    "\26\5\1\240\5\5\25\0\1\5\3\0\1\241\3\0"+
    "\1\241\2\0\3\241\10\0\1\241\1\0\1\241\2\0"+
    "\1\241\5\0\1\241\6\0\3\241\30\0\1\241\2\0"+
    "\3\5\2\0\1\5\2\0\3\5\4\0\16\5\1\242"+
    "\13\5\1\242\1\5\25\0\1\5\2\0\3\5\2\0"+
    "\1\5\2\0\3\5\4\0\11\5\1\243\15\5\1\243"+
    "\4\5\25\0\1\5\2\0\3\5\2\0\1\5\2\0"+
    "\3\5\4\0\17\5\1\244\14\5\25\0\1\5\2\0"+
    "\3\5\2\0\1\5\2\0\3\5\4\0\10\5\1\245"+
    "\23\5\25\0\1\5\2\0\3\5\2\0\1\5\2\0"+
    "\3\5\4\0\5\5\1\246\25\5\1\246\25\0\1\5"+
    "\2\0\3\5\2\0\1\5\2\0\2\5\1\247\4\0"+
    "\34\5\25\0\1\247\2\0\3\5\2\0\1\5\2\0"+
    "\3\5\4\0\5\5\1\250\25\5\1\250\25\0\1\5"+
    "\2\0\3\5\2\0\1\5\2\0\3\5\4\0\5\5"+
    "\1\251\25\5\1\251\25\0\1\5\2\0\3\5\2\0"+
    "\1\5\2\0\3\5\4\0\3\5\1\252\20\5\1\252"+
    "\7\5\25\0\1\5\2\0\3\5\2\0\1\5\2\0"+
    "\3\5\4\0\21\5\1\253\7\5\1\253\2\5\25\0"+
    "\1\5\2\0\3\5\2\0\1\5\2\0\3\5\4\0"+
    "\4\5\1\254\23\5\1\254\3\5\25\0\1\5\2\0"+
    "\3\5\2\0\1\5\2\0\3\5\4\0\5\5\1\255"+
    "\25\5\1\255\25\0\1\5\3\0\1\256\3\0\1\256"+
    "\2\0\3\256\10\0\1\256\1\0\1\256\2\0\1\256"+
    "\5\0\1\256\6\0\3\256\30\0\1\256\2\0\3\5"+
    "\2\0\1\5\2\0\3\5\4\0\1\257\22\5\1\257"+
    "\10\5\25\0\1\5\2\0\3\5\2\0\1\5\2\0"+
    "\3\5\4\0\6\5\1\260\25\5\25\0\1\5\2\0"+
    "\3\5\2\0\1\5\2\0\3\5\4\0\15\5\1\261"+
    "\7\5\1\261\6\5\25\0\1\5\2\0\3\5\2\0"+
    "\1\5\2\0\3\5\4\0\17\5\1\262\14\5\25\0"+
    "\1\5\2\0\3\5\2\0\1\5\2\0\3\5\4\0"+
    "\1\263\22\5\1\263\10\5\25\0\1\5\2\0\3\5"+
    "\2\0\1\5\2\0\3\5\4\0\1\264\22\5\1\264"+
    "\10\5\25\0\1\5\2\0\3\5\2\0\1\5\2\0"+
    "\3\5\4\0\7\5\1\265\24\5\25\0\1\5\2\0"+
    "\3\5\2\0\1\5\2\0\3\5\4\0\7\5\1\266"+
    "\24\5\25\0\1\5\2\0\3\5\2\0\1\5\2\0"+
    "\3\5\4\0\1\267\22\5\1\267\10\5\25\0\1\5"+
    "\2\0\3\5\2\0\1\5\2\0\3\5\4\0\1\270"+
    "\22\5\1\270\10\5\25\0\1\5\2\0\3\5\2\0"+
    "\1\5\2\0\3\5\4\0\12\5\1\271\21\5\25\0"+
    "\1\5\2\0\3\5\2\0\1\272\2\0\3\5\4\0"+
    "\26\5\1\272\5\5\25\0\1\5\2\0\3\5\2\0"+
    "\1\5\2\0\3\5\4\0\3\5\1\273\20\5\1\273"+
    "\7\5\25\0\1\5\2\0\3\5\2\0\1\5\2\0"+
    "\3\5\4\0\10\5\1\234\23\5\25\0\1\5\2\0"+
    "\3\5\2\0\1\5\2\0\3\5\4\0\12\5\1\274"+
    "\21\5\25\0\1\5\2\0\3\5\2\0\1\5\2\0"+
    "\3\5\4\0\5\5\1\275\25\5\1\275\25\0\1\5"+
    "\2\0\3\5\2\0\1\276\2\0\3\5\4\0\26\5"+
    "\1\276\5\5\25\0\1\5\2\0\3\5\2\0\1\5"+
    "\2\0\3\5\4\0\7\5\1\277\24\5\25\0\1\5"+
    "\2\0\3\5\2\0\1\5\2\0\3\5\4\0\14\5"+
    "\1\251\17\5\25\0\1\5\2\0\3\5\2\0\1\5"+
    "\2\0\3\5\4\0\6\5\1\270\25\5\25\0\1\5"+
    "\2\0\3\5\2\0\1\5\2\0\3\5\4\0\5\5"+
    "\1\300\25\5\1\300\25\0\1\5\1\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[8710];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\5\1\1\11\1\1\3\11\17\1\1\11"+
    "\4\1\21\11\1\1\1\11\1\1\1\0\1\1\1\11"+
    "\3\1\1\0\23\1\5\11\2\1\4\11\1\1\4\11"+
    "\1\1\1\0\2\1\1\11\1\0\23\1\1\11\1\0"+
    "\24\1\1\0\20\1\1\0\14\1\1\11\22\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[192];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
  // For assembling string and character constants
  StringBuffer string_buf = new StringBuffer();

  // For line numbers
  public int getCurLineNum() {
    return yyline;
  }
  
  public int getCurColNum() {
    return yycolumn;
  }

  private String filename;

  public void setFilename(String fname) {
    filename = fname;
  }

  public String getCurFilename() {
    return filename;
  }
  
  private void err(int line, int col, String s) {
    errorMsg.error(line, col, s);
  }

  private void err(String s) {
    err(getCurLineNum(), getCurColNum(), s);
  }  
  
  private Symbol symbol(int type) {
    return symbol(type, null);
  }

  private Symbol symbol(int type, Object value) {
    return new BLOGSymbol(type, getCurLineNum(), getCurColNum(), yychar, yychar+yylength(), value);

  }
  
  blog.msg.ErrorMsg errorMsg; //for error
  
  public BLOGLexer(java.io.Reader r, blog.msg.ErrorMsg e) {
    this(r);
    errorMsg=e;
  }



  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public BLOGLexer(java.io.Reader in) {
      // empty for now
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public BLOGLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 184) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 64: 
          { return symbol(BLOGTokenConstants.BOOLEAN_LITERAL, new Boolean(false));
          }
        case 75: break;
        case 61: 
          { return symbol(BLOGTokenConstants.PARAM);
          }
        case 76: break;
        case 7: 
          { return symbol(BLOGTokenConstants.DIV);
          }
        case 77: break;
        case 2: 
          { return symbol(BLOGTokenConstants.ID, yytext());
          }
        case 78: break;
        case 50: 
          { string_buf.append('\n');
          }
        case 79: break;
        case 45: 
          { string_buf.append('\"');
          }
        case 80: break;
        case 12: 
          { return symbol(BLOGTokenConstants.MOD);
          }
        case 81: break;
        case 8: 
          { return symbol(BLOGTokenConstants.MULT);
          }
        case 82: break;
        case 38: 
          { return symbol(BLOGTokenConstants.IF);
          }
        case 83: break;
        case 34: 
          { /* closing single-quote not matched by \' rule below */
       Symbol s;
       if (string_buf.length() == 1) {
	   s = symbol(BLOGTokenConstants.CHAR_LITERAL, 
                          new Character(string_buf.charAt(0)));
       } else {
	   s = symbol(BLOGTokenConstants.ERROR, 
                          "Character literal must contain exactly one "
                          + "character");
       } 
       string_buf = new StringBuffer(); /* re-init buffer */
       yybegin(YYINITIAL);
       return s;
          }
        case 84: break;
        case 28: 
          { return symbol(BLOGTokenConstants.COMMA);
          }
        case 85: break;
        case 21: 
          { return symbol(BLOGTokenConstants.RPAREN);
          }
        case 86: break;
        case 48: 
          { string_buf.append('\r');
          }
        case 87: break;
        case 73: 
          { return symbol(BLOGTokenConstants.PARFACTOR);
          }
        case 88: break;
        case 56: 
          { return symbol(BLOGTokenConstants.ELSE);
          }
        case 89: break;
        case 44: 
          { int code = Integer.parseInt(yytext().substring(1), 8);
         string_buf.append((char) code);
          }
        case 90: break;
        case 46: 
          { string_buf.append('\'');
          }
        case 91: break;
        case 42: 
          { return symbol(BLOGTokenConstants.NEQ);
          }
        case 92: break;
        case 47: 
          { string_buf.append('\t');
          }
        case 93: break;
        case 20: 
          { return symbol(BLOGTokenConstants.LPAREN);
          }
        case 94: break;
        case 5: 
          { return symbol(BLOGTokenConstants.DOT);
          }
        case 95: break;
        case 72: 
          { return symbol(BLOGTokenConstants.DISTINCT);
          }
        case 96: break;
        case 17: 
          { return symbol(BLOGTokenConstants.AND);
          }
        case 97: break;
        case 69: 
          { return symbol(BLOGTokenConstants.FACTOR);
          }
        case 98: break;
        case 62: 
          { return symbol(BLOGTokenConstants.FIXED);
          }
        case 99: break;
        case 54: 
          { return symbol(BLOGTokenConstants.MAP);
          }
        case 100: break;
        case 43: 
          { return symbol(BLOGTokenConstants.ERROR, 
                         "Unrecognized escape character: \'" 
                         + yytext() + "\'");
          }
        case 101: break;
        case 6: 
          { /* Do nothing */
          }
        case 102: break;
        case 3: 
          { return symbol(BLOGTokenConstants.INT_LITERAL, new Integer(yytext()));
          }
        case 103: break;
        case 16: 
          { return symbol(BLOGTokenConstants.NOT);
          }
        case 104: break;
        case 66: 
          { return symbol(BLOGTokenConstants.ELSEIF);
          }
        case 105: break;
        case 26: 
          { return symbol(BLOGTokenConstants.SEMI);
          }
        case 106: break;
        case 31: 
          { /* Char in quotes, not matched by any rule above */
       string_buf.append(yytext());
          }
        case 107: break;
        case 63: 
          { return symbol(BLOGTokenConstants.QUERY);
          }
        case 108: break;
        case 19: 
          { return symbol(BLOGTokenConstants.AT);
          }
        case 109: break;
        case 33: 
          { /* closing double-quote not matched by \" rule below */
       Symbol s =   symbol(BLOGTokenConstants.STRING_LITERAL, 
			       string_buf.toString());
       string_buf = new StringBuffer(); /* reinitialize the buffer */
       yybegin(YYINITIAL);
       return s;
          }
        case 110: break;
        case 9: 
          { yybegin (STR_LIT);
          }
        case 111: break;
        case 41: 
          { return symbol(BLOGTokenConstants.EQEQ);
          }
        case 112: break;
        case 60: 
          { return symbol(BLOGTokenConstants.NULL);
          }
        case 113: break;
        case 11: 
          { return symbol(BLOGTokenConstants.PLUS);
          }
        case 114: break;
        case 40: 
          { return symbol(BLOGTokenConstants.GEQ);
          }
        case 115: break;
        case 29: 
          { return symbol(BLOGTokenConstants.DISTRIB);
          }
        case 116: break;
        case 59: 
          { return symbol(BLOGTokenConstants.BOOLEAN_LITERAL, new Boolean(true));
          }
        case 117: break;
        case 74: 
          { return symbol(BLOGTokenConstants.DISTRIBUTION);
          }
        case 118: break;
        case 51: 
          { string_buf.append('\\');
          }
        case 119: break;
        case 39: 
          { return symbol(BLOGTokenConstants.LEQ);
          }
        case 120: break;
        case 14: 
          { return symbol(BLOGTokenConstants.GT);
          }
        case 121: break;
        case 58: 
          { return symbol(BLOGTokenConstants.THEN);
          }
        case 122: break;
        case 15: 
          { return symbol(BLOGTokenConstants.EQ);
          }
        case 123: break;
        case 22: 
          { return symbol(BLOGTokenConstants.RBRACE);
          }
        case 124: break;
        case 32: 
          { return symbol(BLOGTokenConstants.ERROR, 
                         "Line terminator in string or character literal.");
          }
        case 125: break;
        case 52: 
          { string_buf.append('\b');
          }
        case 126: break;
        case 13: 
          { return symbol(BLOGTokenConstants.LT);
          }
        case 127: break;
        case 68: 
          { return symbol(BLOGTokenConstants.ORIGIN);
          }
        case 128: break;
        case 10: 
          { yybegin (CHAR_LIT);
          }
        case 129: break;
        case 67: 
          { return symbol(BLOGTokenConstants.RANDOM);
          }
        case 130: break;
        case 70: 
          { return symbol(BLOGTokenConstants.FORALL);
          }
        case 131: break;
        case 49: 
          { string_buf.append('\f');
          }
        case 132: break;
        case 37: 
          { /* ignore */
          }
        case 133: break;
        case 53: 
          { return symbol(BLOGTokenConstants.OBS);
          }
        case 134: break;
        case 23: 
          { return symbol(BLOGTokenConstants.LBRACE);
          }
        case 135: break;
        case 24: 
          { return symbol(BLOGTokenConstants.LBRACKET);
          }
        case 136: break;
        case 18: 
          { return symbol(BLOGTokenConstants.OR);
          }
        case 137: break;
        case 4: 
          { return symbol(BLOGTokenConstants.MINUS);
          }
        case 138: break;
        case 35: 
          { return 
		 symbol(BLOGTokenConstants.DOUBLE_LITERAL, new Double(yytext()));
          }
        case 139: break;
        case 65: 
          { return symbol(BLOGTokenConstants.EXISTS);
          }
        case 140: break;
        case 55: 
          { return symbol(BLOGTokenConstants.FOR);
          }
        case 141: break;
        case 27: 
          { return symbol(BLOGTokenConstants.COLON);
          }
        case 142: break;
        case 71: 
          { int code = Integer.parseInt(yytext().substring(2), 16);
       string_buf.append((char) code);
          }
        case 143: break;
        case 25: 
          { return symbol(BLOGTokenConstants.RBRACKET);
          }
        case 144: break;
        case 30: 
          { return symbol(BLOGTokenConstants.NUMSIGN);
          }
        case 145: break;
        case 1: 
          { return symbol(BLOGTokenConstants.ERROR, 
                                          yytext());
          }
        case 146: break;
        case 57: 
          { return symbol(BLOGTokenConstants.TYPE);
          }
        case 147: break;
        case 36: 
          { return symbol(BLOGTokenConstants.RIGHTARROW);
          }
        case 148: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              {   switch(yystate()) {
    case YYINITIAL:
    /* nothing special to do in the initial state */
      break;
    case STR_LIT:
    case CHAR_LIT:
      return symbol(BLOGTokenConstants.ERROR, 
                        "File ended before string or character literal "
                        + "was terminated.");

  }
  /* Reinitialize everything before signaling EOF */
  string_buf = new StringBuffer();
  yybegin(YYINITIAL);
  return symbol(BLOGTokenConstants.EOF);
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
