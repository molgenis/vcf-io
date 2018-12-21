package org.molgenis.genotype.util;

import java.util.HashMap;
import java.util.Map;
import org.molgenis.genotype.GenotypeDataException;

/**
 * General Uilities
 *
 * @author erwin
 */
public class Utils {

  public static final Map<Character, Character> COMPLEMENTAL_NUCLEOTIDES =
      new HashMap<Character, Character>();

  static {
    COMPLEMENTAL_NUCLEOTIDES.put('A', 'T');
    COMPLEMENTAL_NUCLEOTIDES.put('a', 't');
    COMPLEMENTAL_NUCLEOTIDES.put('T', 'A');
    COMPLEMENTAL_NUCLEOTIDES.put('t', 'a');
    COMPLEMENTAL_NUCLEOTIDES.put('C', 'G');
    COMPLEMENTAL_NUCLEOTIDES.put('c', 'g');
    COMPLEMENTAL_NUCLEOTIDES.put('G', 'C');
    COMPLEMENTAL_NUCLEOTIDES.put('g', 'c');
    COMPLEMENTAL_NUCLEOTIDES.put('0', '0');
  }

  public static char getComplementNucleotide(char allele) {
    Character complementAllele = COMPLEMENTAL_NUCLEOTIDES.get(allele);
    if (complementAllele == null) {
      throw new GenotypeDataException("Failed to get comlpement for allele: " + allele);
    }
    return complementAllele;
  }
}
