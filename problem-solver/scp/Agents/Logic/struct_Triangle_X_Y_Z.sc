/*sc_node_not_relation -> struct_Triangle_X_Y_Z;;
sc_node_not_relation -> concept_triangle; segment_XY; segment_XZ; segment_YZ;;
concept_triangle => nrel_main_idtf: [треугольник] (*<-lang_ru;;*);;
struct_Triangle_X_Y_Z => nrel_main_idtf: [Triangle XYZ] (*<-lang_en;;*);;
geometry -> concept_triangle;;
concept_triangle -> struct_Triangle_X_Y_Z;;

struct_Triangle_X_Y_Z => nrel_side: segment_XY; segment_YZ; segment_XZ;;
segment_XY => nrel_length: XY;;
segment_XZ => nrel_length: XZ;;
segment_YZ => nrel_length: YZ;;
struct_Triangle_X_Y_Z => nrel_perimeter: per;;

per <= nrel_value:
		      ...
		      (* -> rrel_m:
 				   ...
				   (* <= nrel_identification:
						             ...
						             (* -> rrel_decimal: [18];; *);;
				    *);;
                      *);;

XY <= nrel_value:
		      ...
		      (* -> rrel_m:
 				   ...
				   (* <= nrel_identification:
						             ...
						             (* -> rrel_decimal: [5];; *);;
				    *);;
                      *);;

YZ <= nrel_value:
		      ...
		      (* -> rrel_m:
 				   ...
				   (* <= nrel_identification:
						             ...
						             (* -> rrel_decimal: [5];; *);;
				    *);;
                      *);;

nrel_side
<- sc_node_norole_relation;
=> nrel_main_idtf: [сторона*] (*<-lang_ru;;*);;

nrel_perimeter
<- sc_node_norole_relation;
=> nrel_main_idtf: [периметр*] (*<-lang_ru;;*);;



concept_triangle <= nrel_main_statements: 
                                         ...
                                         (* -> utv1 
                                                   (* 
                                                   -> rrel_if: Pattern2;;
                                                   -> rrel_then: Pattern5;; 
                                                   *);;
					
                                         *);;

*/
