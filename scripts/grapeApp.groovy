@Grapes(
    @Grab(group='org.apache.commons', module='commons-lang3', version='3.14.0' )
)

import org.apache.commons.lang3.text.WordUtils

String name = "Pietro Ubaldi Testiano Assisi"
WordUtils wordUtils = new WordUtils()

println wordUtils.initials(name)
