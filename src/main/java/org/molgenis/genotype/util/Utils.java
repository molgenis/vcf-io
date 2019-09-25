package org.molgenis.genotype.util;

import java.util.HashMap;
import java.util.Map;
import org.molgenis.genotype.GenotypeDataException;

public class Utils {

  private static final Map<Character, Character> COMPLEMENTARY_NUCLEOTIDES = new HashMap<>();

  static {
    COMPLEMENTARY_NUCLEOTIDES.put('A', 'T');
    COMPLEMENTARY_NUCLEOTIDES.put('a', 't');
    COMPLEMENTARY_NUCLEOTIDES.put('T', 'A');
    COMPLEMENTARY_NUCLEOTIDES.put('t', 'a');
    COMPLEMENTARY_NUCLEOTIDES.put('C', 'G');
    COMPLEMENTARY_NUCLEOTIDES.put('c', 'g');
    COMPLEMENTARY_NUCLEOTIDES.put('G', 'C');
    COMPLEMENTARY_NUCLEOTIDES.put('g', 'c');
    COMPLEMENTARY_NUCLEOTIDES.put('0', '0');
  }

  private Utils() {}

  public static char getComplementNucleotide(char allele) {
    Character complementAllele = COMPLEMENTARY_NUCLEOTIDES.get(allele);
    if (complementAllele == null) {
      throw new GenotypeDataException("Failed to get comlpement for allele: " + allele);
    }
    return complementAllele;
  }
}
