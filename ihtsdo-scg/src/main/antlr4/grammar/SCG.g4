grammar SCG;

expression :  ws (definitionstatus ws)? subexpression ws;
subexpression : focusconcept (ws COLON ws refinement)?;
definitionstatus : equivalentto | subtypeof;
equivalentto : (EQUALS EQUALS EQUALS);
subtypeof : (LESS_THAN LESS_THAN LESS_THAN);
focusconcept : conceptreference (ws PLUS ws conceptreference)*;
conceptreference : conceptid (ws PIPE ws term ws PIPE)?;
conceptid : sctid;
term : nonwsnonpipe ( sp* nonwsnonpipe )*;
refinement :  (attributeset | attributegroup) ( ws (COMMA ws)? attributegroup )*;
attributegroup : LEFT_CURLY_BRACE ws attributeset ws RIGHT_CURLY_BRACE;
attributeset : attribute (ws COMMA ws attribute)*;
attribute : attributename ws EQUALS ws attributevalue;
attributename : conceptreference;
attributevalue :  expressionvalue | (qm stringvalue qm) | (POUND numericvalue);
expressionvalue : conceptreference | (LEFT_PAREN ws subexpression ws RIGHT_PAREN);
stringvalue : (anynonescapedchar | escapedchar)+;
numericvalue : decimalvalue | integervalue;
integervalue : ((DASH|PLUS)? digitnonzero digit* ) | zero;
decimalvalue : integervalue  PERIOD digit+;
sctid : digitnonzero ( digit ) (digit) (digit) (digit) (digit) ((digit)? | ((digit) (digit)) | ((digit) (digit) (digit)) | ((digit) (digit) (digit) (digit)) | ((digit) (digit) (digit) (digit) (digit)) | ((digit) (digit) (digit) (digit) (digit) (digit)) | ((digit) (digit) (digit) (digit) (digit) (digit) (digit)) | ((digit) (digit) (digit) (digit) (digit) (digit) (digit) (digit)) | ((digit) (digit) (digit) (digit) (digit) (digit) (digit) (digit) (digit)) | ((digit) (digit) (digit) (digit) (digit) (digit) (digit) (digit) (digit) (digit)) | ((digit) (digit) (digit) (digit) (digit) (digit) (digit) (digit) (digit) (digit) (digit)) | ((digit) (digit) (digit) (digit) (digit) (digit) (digit) (digit) (digit) (digit) (digit) (digit)));
ws : ( sp | htab | cr | lf )*; // optional white space
sp : SPACE; // space
htab : TAB; // tab
cr : CR; // carriage return
lf : LF; // line feed
qm : QUOTE;  // quotation mark
bs : BACKSLASH;  // back slash
digit : (ZERO | ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE);
zero : ZERO;
digitnonzero : (ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE);
nonwsnonpipe : (EXCLAMATION | QUOTE | POUND | DOLLAR | PERCENT | AMPERSAND | APOSTROPHE | LEFT_PAREN | RIGHT_PAREN | ASTERISK | PLUS | COMMA | DASH | PERIOD | SLASH | ZERO | ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE | COLON | SEMICOLON | LESS_THAN | EQUALS | GREATER_THAN | QUESTION | AT | CAP_A | CAP_B | CAP_C | CAP_D | CAP_E | CAP_F | CAP_G | CAP_H | CAP_I | CAP_J | CAP_K | CAP_L | CAP_M | CAP_N | CAP_O | CAP_P | CAP_Q | CAP_R | CAP_S | CAP_T | CAP_U | CAP_V | CAP_W | CAP_X | CAP_Y | CAP_Z | LEFT_BRACE | BACKSLASH | RIGHT_BRACE | CARAT | UNDERSCORE | ACCENT | A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z | LEFT_CURLY_BRACE) | (RIGHT_CURLY_BRACE | TILDE);
anynonescapedchar : htab | cr | lf | (SPACE | EXCLAMATION) | (POUND | DOLLAR | PERCENT | AMPERSAND | APOSTROPHE | LEFT_PAREN | RIGHT_PAREN | ASTERISK | PLUS | COMMA | DASH | PERIOD | SLASH | ZERO | ONE | TWO | THREE | FOUR | FIVE | SIX | SEVEN | EIGHT | NINE | COLON | SEMICOLON | LESS_THAN | EQUALS | GREATER_THAN | QUESTION | AT | CAP_A | CAP_B | CAP_C | CAP_D | CAP_E | CAP_F | CAP_G | CAP_H | CAP_I | CAP_J | CAP_K | CAP_L | CAP_M | CAP_N | CAP_O | CAP_P | CAP_Q | CAP_R | CAP_S | CAP_T | CAP_U | CAP_V | CAP_W | CAP_X | CAP_Y | CAP_Z | LEFT_BRACE) | (RIGHT_BRACE | CARAT | UNDERSCORE | ACCENT | A | B | C | D | E | F | G | H | I | J | K | L | M | N | O | P | Q | R | S | T | U | V | W | X | Y | Z | LEFT_CURLY_BRACE | PIPE | RIGHT_CURLY_BRACE | TILDE);
escapedchar : (bs qm) |  (bs bs);

//////////////////////////////////////////////////////////////////////////
// Lexer rules generated for each distinct character in original grammar
// per http://www.unicode.org/charts/PDF/U0000.pdf
//////////////////////////////////////////////////////////////////////////

TAB : [\t];
LF : [\n];
CR : [\r];
SPACE : ' ';
EXCLAMATION : '!';
QUOTE : '"';
POUND : '#';
DOLLAR : '$';
PERCENT : '%';
AMPERSAND : '&';
APOSTROPHE : '\'';
LEFT_PAREN : '(';
RIGHT_PAREN : ')';
ASTERISK : '*';
PLUS : '+';
COMMA : ',';
DASH : '-';
PERIOD : '.';
SLASH : '/';
ZERO : '0';
ONE : '1';
TWO : '2';
THREE : '3';
FOUR : '4';
FIVE : '5';
SIX : '6';
SEVEN : '7';
EIGHT : '8';
NINE : '9';
COLON : ':';
SEMICOLON : ';';
LESS_THAN : '<';
EQUALS : '=';
GREATER_THAN : '>';
QUESTION : '?';
AT : '@';
CAP_A : 'A';
CAP_B : 'B';
CAP_C : 'C';
CAP_D : 'D';
CAP_E : 'E';
CAP_F : 'F';
CAP_G : 'G';
CAP_H : 'H';
CAP_I : 'I';
CAP_J : 'J';
CAP_K : 'K';
CAP_L : 'L';
CAP_M : 'M';
CAP_N : 'N';
CAP_O : 'O';
CAP_P : 'P';
CAP_Q : 'Q';
CAP_R : 'R';
CAP_S : 'S';
CAP_T : 'T';
CAP_U : 'U';
CAP_V : 'V';
CAP_W : 'W';
CAP_X : 'X';
CAP_Y : 'Y';
CAP_Z : 'Z';
LEFT_BRACE : '[';
BACKSLASH : '\\';
RIGHT_BRACE : ']';
CARAT : '^';
UNDERSCORE : '_';
ACCENT : '`';
A : 'a';
B : 'b';
C : 'c';
D : 'd';
E : 'e';
F : 'f';
G : 'g';
H : 'h';
I : 'i';
J : 'j';
K : 'k';
L : 'l';
M : 'm';
N : 'n';
O : 'o';
P : 'p';
Q : 'q';
R : 'r';
S : 's';
T : 't';
U : 'u';
V : 'v';
W : 'w';
X : 'x';
Y : 'y';
Z : 'z';
LEFT_CURLY_BRACE : '{';
PIPE : '|';
RIGHT_CURLY_BRACE : '}';
TILDE : '~';