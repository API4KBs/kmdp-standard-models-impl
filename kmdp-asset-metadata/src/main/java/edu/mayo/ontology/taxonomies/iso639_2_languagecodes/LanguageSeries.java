package edu.mayo.ontology.taxonomies.iso639_2_languagecodes;

import static edu.mayo.kmdp.id.helper.DatatypeHelper.indexByUUID;
import static edu.mayo.kmdp.id.helper.DatatypeHelper.resolveAliases;
import static edu.mayo.kmdp.id.helper.DatatypeHelper.resolveTerm;

import edu.mayo.kmdp.id.Term;
import edu.mayo.kmdp.id.VersionedIdentifier;
import edu.mayo.kmdp.series.Series;
import edu.mayo.kmdp.terms.ConceptTerm;
import edu.mayo.kmdp.terms.TermDescription;
import java.net.URI;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import org.omg.spec.api4kp._1_0.identifiers.NamespaceIdentifier;

@javax.xml.bind.annotation.XmlType(name = "LanguageSeries")
@javax.xml.bind.annotation.XmlEnum
@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter( LanguageSeries.Adapter.class )
@com.fasterxml.jackson.databind.annotation.JsonSerialize( using = LanguageSeries.JsonSerializer.class )
@com.fasterxml.jackson.databind.annotation.JsonDeserialize( using = LanguageSeries.JsonDeserializer.class )
public enum LanguageSeries implements Language, Series<Language> {

    Macedo_Romanian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Macedo_Romanian    ) , 
       Mossi(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Mossi    ) , 
       Fang(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Fang    ) , 
       Pampanga(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Pampanga    ) , 
       Kabyle(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Kabyle    ) , 
       Marathi(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Marathi    ) , 
       Pohnpeian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Pohnpeian    ) , 
       Hungarian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Hungarian    ) , 
       Luxembourgish(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Luxembourgish    ) , 
       Tsonga(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Tsonga    ) , 
       Timne(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Timne    ) , 
       Quechua(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Quechua    ) , 
       Spanish(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Spanish    ) , 
       Catalan(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Catalan    ) , 
       Pangasinan(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Pangasinan    ) , 
       Hausa(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Hausa    ) , 
       Ainu(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Ainu    ) , 
       Low_German(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Low_German    ) , 
       Sidamo(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Sidamo    ) , 
       Dargwa(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Dargwa    ) , 
       Delaware(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Delaware    ) , 
       Swahili(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Swahili    ) , 
       Samoan(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Samoan    ) , 
       Wolaitta(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Wolaitta    ) , 
       Sango(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Sango    ) , 
       Rarotongan(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Rarotongan    ) , 
       Bemba(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Bemba    ) , 
       Balinese(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Balinese    ) , 
       Moksha(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Moksha    ) , 
       Ndonga(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Ndonga    ) , 
       Adyghe(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Adyghe    ) , 
       Kara_Kalpak(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Kara_Kalpak    ) , 
       Amharic(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Amharic    ) , 
       Chinese(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Chinese    ) , 
       South_Ndebele(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.South_Ndebele    ) , 
       Mandar(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Mandar    ) , 
       Malay(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Malay    ) , 
       Yapese(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Yapese    ) , 
       Nyamwezi(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Nyamwezi    ) , 
       Tok_Pisin(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Tok_Pisin    ) , 
       Washo(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Washo    ) , 
       Thai(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Thai    ) , 
       Uighur(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Uighur    ) , 
       Lahnda(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Lahnda    ) , 
       Turkish(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Turkish    ) , 
       Sranan_Tongo(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Sranan_Tongo    ) , 
       Buriat(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Buriat    ) , 
       Shan(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Shan    ) , 
       Korean(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Korean    ) , 
       Occitan(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Occitan    ) , 
       Urdu(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Urdu    ) , 
       Czech(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Czech    ) , 
       Afrikaans(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Afrikaans    ) , 
       Navajo(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Navajo    ) , 
       Fon(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Fon    ) , 
       Yiddish(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Yiddish    ) , 
       Lushai(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Lushai    ) , 
       Komi(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Komi    ) , 
       Tuvalu(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Tuvalu    ) , 
       Haida(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Haida    ) , 
       Dhivehi(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Dhivehi    ) , 
       Chuvash(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Chuvash    ) , 
       Tuvinian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Tuvinian    ) , 
       Magahi(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Magahi    ) , 
       Cebuano(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Cebuano    ) , 
       Irish(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Irish    ) , 
       Macedonian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Macedonian    ) , 
       Hiri_Motu(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Hiri_Motu    ) , 
       Papiamento(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Papiamento    ) , 
       Neapolitan(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Neapolitan    ) , 
       Judeo_Persian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Judeo_Persian    ) , 
       Palauan(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Palauan    ) , 
       Uzbek(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Uzbek    ) , 
       Tonga_Nyasa(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Tonga_Nyasa    ) , 
       Niuean(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Niuean    ) , 
       Newari(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Newari    ) , 
       English(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.English    ) , 
       Guarani(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Guarani    ) , 
       Ossetian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Ossetian    ) , 
       Asturian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Asturian    ) , 
       Kabardian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Kabardian    ) , 
       Romanian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Romanian    ) , 
       Lunda(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Lunda    ) , 
       Zenaga(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Zenaga    ) , 
       Udmurt(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Udmurt    ) , 
       Aragonese(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Aragonese    ) , 
       Luba_Katanga(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Luba_Katanga    ) , 
       Luo_Kenya_And_Tanzania(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Luo_Kenya_And_Tanzania    ) , 
       Norwegian_Nynorsk(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Norwegian_Nynorsk    ) , 
       Dogrib(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Dogrib    ) , 
       Herero(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Herero    ) , 
       Tswana(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Tswana    ) , 
       Aleut(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Aleut    ) , 
       Selkup(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Selkup    ) , 
       Maithili(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Maithili    ) , 
       Southern_Sami(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Southern_Sami    ) , 
       Siksika(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Siksika    ) , 
       Hmong(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Hmong    ) , 
       Western_Frisian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Western_Frisian    ) , 
       Javanese(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Javanese    ) , 
       Estonian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Estonian    ) , 
       Lao(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Lao    ) , 
       Buginese(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Buginese    ) , 
       Zapotec(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Zapotec    ) , 
       Kanuri(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Kanuri    ) , 
       Fulah(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Fulah    ) , 
       Malayalam(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Malayalam    ) , 
       Dogri(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Dogri    ) , 
       Tibetan(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Tibetan    ) , 
       Abkhazian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Abkhazian    ) , 
       Scottish_Gaelic(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Scottish_Gaelic    ) , 
       Tonga_Tonga_Islands(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Tonga_Tonga_Islands    ) , 
       Vietnamese(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Vietnamese    ) , 
       Kikuyu(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Kikuyu    ) , 
       Osage(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Osage    ) , 
       Angika(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Angika    ) , 
       Slovenian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Slovenian    ) , 
       Minangkabau(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Minangkabau    ) , 
       Baluchi(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Baluchi    ) , 
       Awadhi(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Awadhi    ) , 
       Eastern_Frisian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Eastern_Frisian    ) , 
       Hindi(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Hindi    ) , 
       Iban(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Iban    ) , 
       Kumyk(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Kumyk    ) , 
       Serer(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Serer    ) , 
       Filipino(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Filipino    ) , 
       Southern_Altai(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Southern_Altai    ) , 
       Fanti(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Fanti    ) , 
       Romansh(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Romansh    ) , 
       Slovak(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Slovak    ) , 
       Ingush(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Ingush    ) , 
       Kalmyk(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Kalmyk    ) , 
       Telugu(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Telugu    ) , 
       Inupiaq(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Inupiaq    ) , 
       Mende(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Mende    ) , 
       Lamba(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Lamba    ) , 
       Walloon(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Walloon    ) , 
       Duala(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Duala    ) , 
       Rundi(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Rundi    ) , 
       Mandingo(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Mandingo    ) , 
       Tajik(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Tajik    ) , 
       Twi(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Twi    ) , 
       Tiv(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Tiv    ) , 
       Cornish(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Cornish    ) , 
       Southern_Sotho(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Southern_Sotho    ) , 
       Tumbuka(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Tumbuka    ) , 
       Ekajuk(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Ekajuk    ) , 
       North_Ndebele(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.North_Ndebele    ) , 
       Xhosa(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Xhosa    ) , 
       Tamashek(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Tamashek    ) , 
       Gondi(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Gondi    ) , 
       Kpelle(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Kpelle    ) , 
       Lower_Sorbian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Lower_Sorbian    ) , 
       Faroese(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Faroese    ) , 
       Mohawk(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Mohawk    ) , 
       Kirghiz(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Kirghiz    ) , 
       Marwari(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Marwari    ) , 
       Tsimshian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Tsimshian    ) , 
       Santali(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Santali    ) , 
       Tigrinya(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Tigrinya    ) , 
       Bulgarian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Bulgarian    ) , 
       Gilbertese(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Gilbertese    ) , 
       Swedish(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Swedish    ) , 
       Zaza(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Zaza    ) , 
       Hupa(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Hupa    ) , 
       Creek(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Creek    ) , 
       Kalaallisut(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Kalaallisut    ) , 
       Mapudungun(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Mapudungun    ) , 
       Zuni(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Zuni    ) , 
       Welsh(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Welsh    ) , 
       Haitian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Haitian    ) , 
       Scots(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Scots    ) , 
       Kazakh(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Kazakh    ) , 
       Galician(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Galician    ) , 
       Tahitian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Tahitian    ) , 
       Sukuma(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Sukuma    ) , 
       Tokelau(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Tokelau    ) , 
       Panjabi(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Panjabi    ) , 
       Ganda(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Ganda    ) , 
       Nzima(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Nzima    ) , 
       Dakota(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Dakota    ) , 
       Mari(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Mari    ) , 
       Nepali(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Nepali    ) , 
       Ukrainian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Ukrainian    ) , 
       Avaric(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Avaric    ) , 
       Kongo(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Kongo    ) , 
       Fijian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Fijian    ) , 
       Acoli(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Acoli    ) , 
       Japanese(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Japanese    ) , 
       Grebo(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Grebo    ) , 
       Sardinian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Sardinian    ) , 
       Mongolian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Mongolian    ) , 
       Standard_Moroccan_Tamazight(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Standard_Moroccan_Tamazight    ) , 
       Zhuang(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Zhuang    ) , 
       Manchu(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Manchu    ) , 
       Friulian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Friulian    ) , 
       Basque(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Basque    ) , 
       Chuukese(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Chuukese    ) , 
       Skolt_Sami(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Skolt_Sami    ) , 
       Chipewyan(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Chipewyan    ) , 
       Dinka(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Dinka    ) , 
       Ojibwa(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Ojibwa    ) , 
       Beja(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Beja    ) , 
       Kannada(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Kannada    ) , 
       Dutch(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Dutch    ) , 
       Inuktitut(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Inuktitut    ) , 
       Hawaiian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Hawaiian    ) , 
       Norwegian_Bokmal(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Norwegian_Bokmal    ) , 
       Sinhala(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Sinhala    ) , 
       Kurukh(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Kurukh    ) , 
       Zulu(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Zulu    ) , 
       Kamba(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Kamba    ) , 
       Umbundu(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Umbundu    ) , 
       Assamese(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Assamese    ) , 
       Tigre(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Tigre    ) , 
       Central_Khmer(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Central_Khmer    ) , 
       Tetum(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Tetum    ) , 
       Arapaho(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Arapaho    ) , 
       Lezghian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Lezghian    ) , 
       Judeo_Arabic(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Judeo_Arabic    ) , 
       Yao(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Yao    ) , 
       Ewe(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Ewe    ) , 
       Montenegrin(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Montenegrin    ) , 
       Nias(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Nias    ) , 
       Shona(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Shona    ) , 
       Burmese(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Burmese    ) , 
       Norwegian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Norwegian    ) , 
       Luba_Lulua(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Luba_Lulua    ) , 
       Chechen(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Chechen    ) , 
       Makasar(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Makasar    ) , 
       Kuanyama(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Kuanyama    ) , 
       Bislama(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Bislama    ) , 
       Lingala(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Lingala    ) , 
       Russian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Russian    ) , 
       Romany(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Romany    ) , 
       Dzongkha(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Dzongkha    ) , 
       Breton(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Breton    ) , 
       Karelian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Karelian    ) , 
       Slave_Athapascan(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Slave_Athapascan    ) , 
       Kashubian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Kashubian    ) , 
       Efik(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Efik    ) , 
       Choctaw(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Choctaw    ) , 
       Tereno(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Tereno    ) , 
       Turkmen(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Turkmen    ) , 
       Vai(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Vai    ) , 
       Dyula(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Dyula    ) , 
       Latvian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Latvian    ) , 
       Swati(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Swati    ) , 
       Arabic(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Arabic    ) , 
       Maltese(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Maltese    ) , 
       Nyankole(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Nyankole    ) , 
       Luiseno(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Luiseno    ) , 
       Mongo(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Mongo    ) , 
       Azerbaijani(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Azerbaijani    ) , 
       Armenian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Armenian    ) , 
       Afar(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Afar    ) , 
       Cree(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Cree    ) , 
       Cheyenne(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Cheyenne    ) , 
       Wolof(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Wolof    ) , 
       Sicilian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Sicilian    ) , 
       Somali(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Somali    ) , 
       Gbaya(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Gbaya    ) , 
       Sasak(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Sasak    ) , 
       Limburgan(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Limburgan    ) , 
       Icelandic(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Icelandic    ) , 
       Bikol(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Bikol    ) , 
       Sindhi(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Sindhi    ) , 
       Tatar(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Tatar    ) , 
       Basa(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Basa    ) , 
       Syriac(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Syriac    ) , 
       Albanian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Albanian    ) , 
       Chinook_Jargon(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Chinook_Jargon    ) , 
       Kurdish(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Kurdish    ) , 
       Crimean_Tatar(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Crimean_Tatar    ) , 
       Bilin(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Bilin    ) , 
       Bosnian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Bosnian    ) , 
       Northern_Frisian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Northern_Frisian    ) , 
       Bashkir(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Bashkir    ) , 
       Yakut(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Yakut    ) , 
       Konkani(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Konkani    ) , 
       Venda(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Venda    ) , 
       Pedi(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Pedi    ) , 
       Kutenai(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Kutenai    ) , 
       Masai(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Masai    ) , 
       Corsican(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Corsican    ) , 
       Croatian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Croatian    ) , 
       German(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.German    ) , 
       Bini(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Bini    ) , 
       Kimbundu(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Kimbundu    ) , 
       Northern_Sami(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Northern_Sami    ) , 
       Portuguese(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Portuguese    ) , 
       Braj(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Braj    ) , 
       Lithuanian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Lithuanian    ) , 
       Maori(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Maori    ) , 
       Sichuan_Yi(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Sichuan_Yi    ) , 
       Lule_Sami(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Lule_Sami    ) , 
       Lozi(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Lozi    ) , 
       Upper_Sorbian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Upper_Sorbian    ) , 
       Kosraean(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Kosraean    ) , 
       Caddo(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Caddo    ) , 
       Gorontalo(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Gorontalo    ) , 
       Sundanese(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Sundanese    ) , 
       Georgian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Georgian    ) , 
       Malagasy(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Malagasy    ) , 
       Rajasthani(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Rajasthani    ) , 
       Nyoro(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Nyoro    ) , 
       Bhojpuri(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Bhojpuri    ) , 
       Italian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Italian    ) , 
       Aymara(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Aymara    ) , 
       Indonesian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Indonesian    ) , 
       French(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.French    ) , 
       Erzya(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Erzya    ) , 
       Yoruba(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Yoruba    ) , 
       Susu(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Susu    ) , 
       Modern_Greek(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Modern_Greek    ) , 
       Serbian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Serbian    ) , 
       Gwich_In(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Gwich_In    ) , 
       Achinese(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Achinese    ) , 
       Ewondo(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Ewondo    ) , 
       Sandawe(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Sandawe    ) , 
       Bengali(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Bengali    ) , 
       Akan(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Akan    ) , 
       Madurese(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Madurese    ) , 
       Gujarati(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Gujarati    ) , 
       Waray(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Waray    ) , 
       Finnish(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Finnish    ) , 
       Gayo(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Gayo    ) , 
       Soninke(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Soninke    ) , 
       Igbo(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Igbo    ) , 
       Oromo(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Oromo    ) , 
       Khasi(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Khasi    ) , 
       Swiss_German(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Swiss_German    ) , 
       Tagalog(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Tagalog    ) , 
       Manipuri(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Manipuri    ) , 
       Persian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Persian    ) , 
       N_Ko(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.N_Ko    ) , 
       Hiligaynon(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Hiligaynon    ) , 
       Galibi_Carib(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Galibi_Carib    ) , 
       Rapanui(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Rapanui    ) , 
       Tlingit(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Tlingit    ) , 
       Belarusian(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Belarusian    ) , 
       Nyanja(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Nyanja    ) , 
       Hebrew(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Hebrew    ) , 
       Karachay_Balkar(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Karachay_Balkar    ) , 
       Nogai(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Nogai    ) , 
       Adangme(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Adangme    ) , 
       Pushto(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Pushto    ) , 
       Bambara(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Bambara    ) , 
       Marshallese(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Marshallese    ) , 
       Cherokee(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Cherokee    ) , 
       Mirandese(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Mirandese    ) , 
       Danish(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Danish    ) , 
       Chamorro(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Chamorro    ) , 
       Iloko(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Iloko    ) , 
       Kinyarwanda(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Kinyarwanda    ) , 
       Ladino(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Ladino    ) , 
       Nauru(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Nauru    ) , 
       Polish(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Polish    ) , 
       Kashmiri(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Kashmiri    ) , 
       Tamil(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Tamil    ) , 
       Ga(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Ga    ) , 
       Mi_Kmaq(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Mi_Kmaq    ) , 
       Kachin(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Kachin    ) , 
       Oriya(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Oriya    ) , 
       Votic(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Votic    ) , 
       Inari_Sami(  edu.mayo.ontology.taxonomies.iso639_2_languagecodes._20190201.Language.Inari_Sami    ) 
   ;

  private static final Map<UUID, LanguageSeries> index = indexByUUID(LanguageSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20190201"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2019-02-01"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/ISO639-2-LanguageCodes/20190201/")  
          );

  public static final URI latestVersionIdentifier = schemeVersionIdentifiers.get(0);

  private List<Language> versions;

  LanguageSeries(Language... versions) {
    this.versions = Arrays.asList(versions);
  }

  public List<Language> getVersions() {
    return versions;
  }

  public LanguageSeries asEnum() {
    return this;
  }

  public Series<Language> asSeries() {
    return this;
  }

  public static int count() {
    return values().length;
  }

  public static int countUnexpired() {
    return  (int) Arrays.stream(values())
        .filter(x -> !x.isSeriesExpired())
        .count();
  }

  @Override
  public TermDescription getDescription() {
    return latest().map(ConceptTerm::getDescription)
        .orElse(null);
  }

  @Override
  public NamespaceIdentifier getNamespace() {
    return Language.seriesNamespace;
  }
  
  @Override
  public VersionedIdentifier getVersionIdentifier() {
    return getLatest().getVersionIdentifier();
  }  

  @Override
  public boolean isSeriesExpired() {
    Date lastEstablished = getLatest().getVersionEstablishedOn();
    return ! schemeReleases.isEmpty() && schemeReleases.get(0).compareTo(lastEstablished) > 0;
  }

  @Override
  public Optional<Date> getSeriesExpiredOn() {
    Date lastEstablished = getLatest().getVersionEstablishedOn();
    return schemeReleases.stream()
        .filter(r -> r.compareTo(lastEstablished) > 0)
        .min(java.util.Comparator.naturalOrder());
  }


  @Override
  public String getVersionTag() {
    return getNamespace().getVersion();
  }

  @Override
  public Date getEstablishedOn() {
    return getNamespace().getEstablishedOn();
  }

  public static Optional<Language> resolve(final Term trm) {
    return trm != null ? resolveId(trm.getConceptId()) : Optional.empty();
  }

  public static Optional<Language> resolve(final String tag) {
    return tag != null ? resolveTag(tag) : Optional.empty();
  }

  public static Optional<Language> resolveId(final String conceptId) {
    return conceptId != null ? resolveId(URI.create(conceptId)) : Optional.empty();
  }

  public static Optional<Language> resolveRef(final String refUri) {
    return refUri != null ? resolveRef(URI.create(refUri)) : Optional.empty();
  }

  public static Optional<Language> resolveTag(final String tag) {
    Optional<Language> l = resolveTerm(tag,  LanguageSeries.values(), Term::getTag);
    if (!l.isPresent()) {
      l = resolveAliases(tag,  LanguageSeries.values(), ConceptTerm::getTags);
    }
    return l;
  }

  public static Optional<Language> resolveUUID(final UUID conceptId) {
    return conceptId != null
      ? Optional.ofNullable(index.get(conceptId))
      : Optional.empty();
  }

  public static Optional<Language> resolveId(final URI conceptId) {
    return resolveTerm(conceptId, LanguageSeries.values(), Term::getConceptId);
  }

  public static Optional<Language> resolveRef(final URI refUri) {
    return resolveTerm(refUri, LanguageSeries.values(), Term::getRef);
  }


  public static class Adapter extends edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter {
    public static final edu.mayo.kmdp.terms.adapters.xml.TermsXMLAdapter instance = new LanguageSeries.Adapter();
    protected LanguageSeries[] getValues() { return values(); }
  }


  public static class JsonSerializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Serializer<Language> {

  }

  public static class JsonDeserializer extends edu.mayo.kmdp.terms.adapters.json.URITermsJsonAdapter.Deserializer<Language> {
    protected Language[] getValues() { return values(); }

    @Override
    protected Optional<Language> resolveUUID(UUID uuid) {
      return LanguageSeries.resolveUUID(uuid);
    }
  }
}


