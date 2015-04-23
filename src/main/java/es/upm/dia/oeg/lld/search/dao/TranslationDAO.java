package es.upm.dia.oeg.lld.search.dao;

import java.util.List;

import es.upm.dia.oeg.lld.search.model.Translation;

public interface TranslationDAO {

    public List<String> getLanguages();

    public List<Translation> searchDirectTranslations(String label,
            String langSource, String langTarget, boolean babelnet);

    public List<Translation> searchIndirectTranslations(String label,
            String langSource, String langTarget, boolean babelnet);
}
