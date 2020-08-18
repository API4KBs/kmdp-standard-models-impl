package edu.mayo.ontology.taxonomies.iso639_1_languagecodes;

import static edu.mayo.kmdp.id.helper.LegacyDatatypeHelper.indexByUUID;
import static edu.mayo.kmdp.id.helper.LegacyDatatypeHelper.resolveAliases;
import static edu.mayo.kmdp.id.helper.LegacyDatatypeHelper.resolveTerm;

import edu.mayo.kmdp.id.Term;
import edu.mayo.kmdp.id.VersionedIdentifier;
import edu.mayo.kmdp.series.Series;
import edu.mayo.kmdp.terms.ConceptTerm;
import edu.mayo.kmdp.terms.TermDescription;
import edu.mayo.kmdp.terms.adapters.xml.LegacyTermsXMLAdapter;
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

    Icelandic(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Icelandic    ) , 
       Inupiaq(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Inupiaq    ) , 
       Somali(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Somali    ) , 
       Tatar(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Tatar    ) , 
       Rundi(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Rundi    ) , 
       Latvian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Latvian    ) , 
       Swati(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Swati    ) , 
       Arabic(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Arabic    ) , 
       Belarusian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Belarusian    ) , 
       Chuvash(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Chuvash    ) , 
       Kuanyama(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Kuanyama    ) , 
       Tahitian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Tahitian    ) , 
       Kirghiz(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Kirghiz    ) , 
       Urdu(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Urdu    ) , 
       Czech(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Czech    ) , 
       Chechen(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Chechen    ) , 
       Bislama(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Bislama    ) , 
       Armenian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Armenian    ) , 
       North_Ndebele(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.North_Ndebele    ) , 
       Nauru(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Nauru    ) , 
       Scottish_Gaelic(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Scottish_Gaelic    ) , 
       Telugu(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Telugu    ) , 
       Abkhazian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Abkhazian    ) , 
       Yoruba(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Yoruba    ) , 
       Tajik(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Tajik    ) , 
       Swedish(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Swedish    ) , 
       Twi(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Twi    ) , 
       Norwegian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Norwegian    ) , 
       Lingala(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Lingala    ) , 
       Southern_Sotho(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Southern_Sotho    ) , 
       French(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.French    ) , 
       Macedonian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Macedonian    ) , 
       Zulu(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Zulu    ) , 
       Hiri_Motu(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Hiri_Motu    ) , 
       Chinese(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Chinese    ) , 
       Amharic(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Amharic    ) , 
       Venda(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Venda    ) , 
       Italian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Italian    ) , 
       Finnish(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Finnish    ) , 
       Igbo(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Igbo    ) , 
       Romansh(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Romansh    ) , 
       Slovenian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Slovenian    ) , 
       Tonga_Tonga_Islands(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Tonga_Tonga_Islands    ) , 
       Walloon(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Walloon    ) , 
       Northern_Sami(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Northern_Sami    ) , 
       Turkish(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Turkish    ) , 
       Vietnamese(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Vietnamese    ) , 
       Serbian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Serbian    ) , 
       Burmese(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Burmese    ) , 
       Albanian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Albanian    ) , 
       Javanese(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Javanese    ) , 
       Kongo(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Kongo    ) , 
       Georgian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Georgian    ) , 
       Lao(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Lao    ) , 
       Japanese(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Japanese    ) , 
       Hindi(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Hindi    ) , 
       Sinhala(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Sinhala    ) , 
       Basque(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Basque    ) , 
       Indonesian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Indonesian    ) , 
       Slovak(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Slovak    ) , 
       Fijian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Fijian    ) , 
       Croatian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Croatian    ) , 
       Catalan(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Catalan    ) , 
       Limburgan(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Limburgan    ) , 
       Luba_Katanga(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Luba_Katanga    ) , 
       Sindhi(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Sindhi    ) , 
       Norwegian_Nynorsk(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Norwegian_Nynorsk    ) , 
       Herero(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Herero    ) , 
       Dutch(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Dutch    ) , 
       Western_Frisian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Western_Frisian    ) , 
       Estonian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Estonian    ) , 
       Ossetian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Ossetian    ) , 
       Romanian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Romanian    ) , 
       English(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.English    ) , 
       Bashkir(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Bashkir    ) , 
       Afar(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Afar    ) , 
       Cree(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Cree    ) , 
       Komi(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Komi    ) , 
       Russian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Russian    ) , 
       Yiddish(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Yiddish    ) , 
       Dzongkha(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Dzongkha    ) , 
       Breton(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Breton    ) , 
       Irish(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Irish    ) , 
       Wolof(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Wolof    ) , 
       Tsonga(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Tsonga    ) , 
       Guarani(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Guarani    ) , 
       Occitan(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Occitan    ) , 
       Turkmen(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Turkmen    ) , 
       Aragonese(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Aragonese    ) , 
       Ewe(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Ewe    ) , 
       Tswana(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Tswana    ) , 
       Haitian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Haitian    ) , 
       Azerbaijani(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Azerbaijani    ) , 
       Uighur(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Uighur    ) , 
       Afrikaans(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Afrikaans    ) , 
       Akan(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Akan    ) , 
       Ndonga(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Ndonga    ) , 
       Faroese(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Faroese    ) , 
       Maltese(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Maltese    ) , 
       Galician(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Galician    ) , 
       Shona(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Shona    ) , 
       Welsh(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Welsh    ) , 
       Bengali(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Bengali    ) , 
       Modern_Greek(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Modern_Greek    ) , 
       Uzbek(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Uzbek    ) , 
       Korean(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Korean    ) , 
       Samoan(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Samoan    ) , 
       Dhivehi(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Dhivehi    ) , 
       Inuktitut(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Inuktitut    ) , 
       Norwegian_Bokmal(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Norwegian_Bokmal    ) , 
       Malagasy(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Malagasy    ) , 
       Sundanese(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Sundanese    ) , 
       Marathi(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Marathi    ) , 
       Sardinian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Sardinian    ) , 
       Assamese(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Assamese    ) , 
       Gujarati(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Gujarati    ) , 
       South_Ndebele(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.South_Ndebele    ) , 
       Luxembourgish(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Luxembourgish    ) , 
       Central_Khmer(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Central_Khmer    ) , 
       Thai(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Thai    ) , 
       Navajo(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Navajo    ) , 
       Ojibwa(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Ojibwa    ) , 
       Malayalam(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Malayalam    ) , 
       Kashmiri(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Kashmiri    ) , 
       Tibetan(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Tibetan    ) , 
       Maori(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Maori    ) , 
       Kikuyu(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Kikuyu    ) , 
       Lithuanian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Lithuanian    ) , 
       Sichuan_Yi(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Sichuan_Yi    ) , 
       Sango(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Sango    ) , 
       Nepali(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Nepali    ) , 
       Portuguese(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Portuguese    ) , 
       Cornish(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Cornish    ) , 
       Pushto(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Pushto    ) , 
       Avaric(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Avaric    ) , 
       Kanuri(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Kanuri    ) , 
       Kazakh(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Kazakh    ) , 
       Zhuang(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Zhuang    ) , 
       German(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.German    ) , 
       Chamorro(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Chamorro    ) , 
       Hungarian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Hungarian    ) , 
       Mongolian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Mongolian    ) , 
       Danish(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Danish    ) , 
       Aymara(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Aymara    ) , 
       Fulah(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Fulah    ) , 
       Bosnian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Bosnian    ) , 
       Spanish(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Spanish    ) , 
       Quechua(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Quechua    ) , 
       Corsican(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Corsican    ) , 
       Malay(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Malay    ) , 
       Hausa(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Hausa    ) , 
       Bulgarian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Bulgarian    ) , 
       Tigrinya(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Tigrinya    ) , 
       Kannada(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Kannada    ) , 
       Polish(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Polish    ) , 
       Persian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Persian    ) , 
       Oriya(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Oriya    ) , 
       Swahili(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Swahili    ) , 
       Tagalog(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Tagalog    ) , 
       Tamil(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Tamil    ) , 
       Oromo(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Oromo    ) , 
       Ganda(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Ganda    ) , 
       Panjabi(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Panjabi    ) , 
       Nyanja(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Nyanja    ) , 
       Hebrew(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Hebrew    ) , 
       Ukrainian(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Ukrainian    ) , 
       Bambara(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Bambara    ) , 
       Kurdish(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Kurdish    ) , 
       Marshallese(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Marshallese    ) , 
       Kalaallisut(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Kalaallisut    ) , 
       Kinyarwanda(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Kinyarwanda    ) , 
       Xhosa(  edu.mayo.ontology.taxonomies.iso639_1_languagecodes._20190201.Language.Xhosa    ) 
   ;

  private static final Map<UUID, LanguageSeries> index = indexByUUID(LanguageSeries.values());

  public static final List<String> schemeVersions =
      java.util.Arrays.asList( "20190201"   );

  public static final List<Date> schemeReleases =
      edu.mayo.kmdp.util.DateTimeUtil.parseDates(java.util.Arrays.asList( "2019-02-01"   ));

  public static final List<URI> schemeVersionIdentifiers =
      java.util.Arrays.asList(
             URI.create("https://ontology.mayo.edu/taxonomies/ISO639-1-LanguageCodes/20190201/")  
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


  public static class Adapter extends LegacyTermsXMLAdapter {
    public static final LegacyTermsXMLAdapter instance = new LanguageSeries.Adapter();
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


