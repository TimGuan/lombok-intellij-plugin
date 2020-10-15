package de.plushnikov.intellij.plugin.inspection.modifiers;

import de.plushnikov.intellij.plugin.LombokNames;

import static com.intellij.psi.PsiModifier.FINAL;
import static com.intellij.psi.PsiModifier.STATIC;
import static de.plushnikov.intellij.plugin.inspection.modifiers.RedundantModifiersInfoType.*;

public class RedundantModifiersOnUtilityClassLombokAnnotationInspection extends LombokRedundantModifierInspection {

  public RedundantModifiersOnUtilityClassLombokAnnotationInspection() {
    super(
      LombokNames.UTILITY_CLASS,
      new RedundantModifiersInfo(CLASS, null,"@UtilityClass already marks the class final.",  FINAL),
      new RedundantModifiersInfo(FIELD, null, "@UtilityClass already marks fields static.", STATIC),
      new RedundantModifiersInfo(METHOD, null, "@UtilityClass already marks methods static." , STATIC),
      new RedundantModifiersInfo(INNER_CLASS, null, "@UtilityClass already marks inner classes static.", STATIC)
    );
  }
}
