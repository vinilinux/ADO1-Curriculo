package i.github.vinilinux.curriculo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {

    @GetMapping("/*")
    public ModelAndView curriculo() {
        ModelAndView mv = new ModelAndView("curriculo");
        mv.addObject("nome", "Vinicius Lima Alves");
        mv.addObject("email", "viniciuslimalves.io@gmail.com");
        mv.addObject("github", "https://github.com/vinilinux?tab=repositories");
        mv.addObject("tel", "11 95800-8847");
        mv.addObject("resumo", "Trabalhei com projetos de\n" +
                "            infraestrutura usando AWS, dentre esses\n" +
                "            projetos tive uma atuação maior em\n" +
                "            projetos de migração para AWS. Estou no\n" +
                "            processo de transição de carreira,\n" +
                "            atuando como freelancer nos últimos\n" +
                "            meses. Minha especialidade inclui Java,\n" +
                "            HTML, CSS, Bootstrap, Sistemas\n" +
                "            Operacionais e AWS.");
        mv.addObject("instituicao", "Centro Universitário Senac");
        mv.addObject("graduacao", "Tecnólogo em Análise e Desenvolvimento de Sistemas");
        mv.addObject("graduacao2", "Tecnólogo em Gestão da Tecnologia da Informação");
        mv.addObject("periodo", "Previsão de conclusão: 06/2024");
        mv.addObject("periodo2", "2017 - 2019");
        mv.addObject("empresa1", "Locaweb");
        mv.addObject("cargo1", "Analista de Suporte de TI");
        mv.addObject("tempo1", "2018 - 2019");
        mv.addObject("empresa2", "Nextios");
        mv.addObject("cargo2","Information Technology Support Analyst");
        mv.addObject("tempo2","2019 - 2021");
        mv.addObject("empresa3","BRLink");
        mv.addObject("Cargo3","L2.2 Cloud Analyst");
        mv.addObject("tempo3","2021 - 2023");



        return mv;
    }

}
