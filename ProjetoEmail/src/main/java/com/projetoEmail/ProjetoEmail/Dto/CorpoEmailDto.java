package com.projetoEmail.ProjetoEmail.Dto;

public class CorpoEmailDto {
	String nome;
	String html;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String organizaHtml(String nome,String poema) {
		String html = "<!doctype html>\n" +
	              "<html lang=\"en\" xmlns=\"http://www.w3.org/1999/xhtml\" xmlns:v=\"urn:schemas-microsoft-com:vml\" xmlns:o=\"urn:schemas-microsoft-com:office:office\">\n" +
	              "<head>\n" +
	              "<title></title>\n" +
	              "<!--[if !mso]><!-->\n" +
	              "<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
	              "<!--<![endif]-->\n" +
	              "<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n" +
	              "<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
	              "<style type=\"text/css\">\n" +
	              "#outlook a{padding:0;}body{margin:0;padding:0;-webkit-text-size-adjust:100%;-ms-text-size-adjust:100%;}table,td{border-collapse:collapse;mso-table-lspace:0pt;mso-table-rspace:0pt;}img{border:0;height:auto;line-height:100%;outline:none;text-decoration:none;-ms-interpolation-mode:bicubic;}p{display:block;margin:0;}\n" +
	              "</style>\n" +
	              "<!--[if mso]> <noscript><xml><o:OfficeDocumentSettings><o:AllowPNG/><o:PixelsPerInch>96</o:PixelsPerInch></o:OfficeDocumentSettings></xml></noscript>\n" +
	              "<![endif]-->\n" +
	              "<!--[if lte mso 11]>\n" +
	              "<style type=\"text/css\">\n" +
	              ".ogf{width:100% !important;}\n" +
	              "</style>\n" +
	              "<![endif]-->\n" +
	              "<!--[if !mso]><!-->\n" +
	              "<link href=\"https://fonts.googleapis.com/css?family=Inter:700,400\" rel=\"stylesheet\" type=\"text/css\">\n" +
	              "<style type=\"text/css\">\n" +
	              "\n" +
	              "</style>\n" +
	              "<!--<![endif]-->\n" +
	              "<style type=\"text/css\">\n" +
	              "@media only screen and (min-width:612px){.xc282{width:282px!important;max-width:282px;}.xc16{width:16px!important;max-width:16px;}.xc1{width:1px!important;max-width:1px;}}\n" +
	              "</style>\n" +
	              "<style media=\"screen and (min-width:612px)\">.moz-text-html .xc282{width:282px!important;max-width:282px;}.moz-text-html .xc16{width:16px!important;max-width:16px;}.moz-text-html .xc1{width:1px!important;max-width:1px;}\n" +
	              "</style>\n" +
	              "<style type=\"text/css\">\n" +
	              "@media only screen and (max-width:611px){table.fwm{width:100%!important;}td.fwm{width:auto!important;}}\n" +
	              "</style>\n" +
	              "<style type=\"text/css\">\n" +
	              "u+.emailify .gs{background:#000;mix-blend-mode:screen;display:inline-block;padding:0;margin:0;}u+.emailify .gd{background:#000;mix-blend-mode:difference;display:inline-block;padding:0;margin:0;}p{-webkit-font-smoothing:antialiased;-moz-osx-font-smoothing:grayscale;}a[x-apple-data-detectors]{color:inherit!important;text-decoration:none!important;}u+.emailify a{color:inherit!important;text-decoration:none!important;}#MessageViewBody a{color:inherit!important;text-decoration:none!important;}\n" +
	              "@media only screen and (max-width:612px){.emailify{height:100%!important;margin:0!important;padding:0!important;width:100%!important;}u+.emailify .glist{margin-left:1em!important;}td.ico.v>div.il>a.l.m,td.ico.v .mn-label{padding-right:0!important;padding-bottom:16px!important;}td.x{padding-left:0!important;padding-right:0!important;}.fwm img{max-width:100%!important;height:auto!important;}.aw img{width:auto!important;margin-left:auto!important;margin-right:auto!important;}.awl img{width:auto!important;margin-right:auto!important;}.awr img{width:auto!important;margin-left:auto!important;}.ah img{height:auto!important;}td.b.nw>table,td.b.nw a{width:auto!important;}td.stk{border:0!important;}td.u{height:auto!important;}br.sb{display:none!important;}.thd-1 .i-thumbnail{display:inline-block!important;height:auto!important;overflow:hidden!important;}.hd-1{display:block!important;height:auto!important;overflow:visible!important;}.hm-1{display:none!important;max-width:0!important;max-height:0!important;overflow:hidden!important;mso-hide:all!important;}.ht-1{display:table!important;height:auto!important;overflow:visible!important;}.hr-1{display:table-row!important;height:auto!important;overflow:visible!important;}.hc-1{display:table-cell!important;height:auto!important;overflow:visible!important;}div.r.pr-16>table>tbody>tr>td,div.r.pr-16>div>table>tbody>tr>td{padding-right:16px!important}div.r.pl-16>table>tbody>tr>td,div.r.pl-16>div>table>tbody>tr>td{padding-left:16px!important}div.g.mb-16>table>tbody>tr>td{padding-bottom:16px!important}}\n" +
	              "@media screen yahoo{.hd-1,.ds-1{mso-hide:all!important;display:none!important;height:0!important;overflow:hidden!important;}}\n" +
	              "@media (prefers-color-scheme:light) and (max-width:612px){.ds-1.hd-1{display:none!important;height:0!important;overflow:hidden!important;}}\n" +
	              "@media (prefers-color-scheme:dark) and (max-width:612px){.ds-1.hd-1{display:block!important;height:auto!important;overflow:visible!important;}}\n" +
	              "</style>\n" +
	              "<meta name=\"color-scheme\" content=\"light dark\">\n" +
	              "<meta name=\"supported-color-schemes\" content=\"light dark\">\n" +
	              "<![endif]-->\n" +
	              "</head>\n" +
	              "<body lang=\"en\" link=\"#DD0000\" vlink=\"#DD0000\" class=\"emailify\" style=\"mso-line-height-rule:exactly;mso-hyphenate:none;word-spacing:normal;background-color:#f5f5f5;\"><div class=\"bg\" style=\"background-color:#f5f5f5;\" lang=\"en\">\n" +
	              "<!--[if mso | IE]>\n" +
	              "<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" class=\"r-outlook -outlook pr-16-outlook pl-16-outlook -outlook\" role=\"presentation\" style=\"width:613px;\" width=\"613\"><tr><td style=\"line-height:0;font-size:0;mso-line-height-rule:exactly;\">\n" +
	              "<![endif]--><div class=\"r pr-16 pl-16\" style=\"background:#fffffe;background-color:#fffffe;margin:0px auto;max-width:613px;\">\n" +
	              "<table align=\"center\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"background:#fffffe;background-color:#fffffe;width:100%;\"><tbody><tr><td style=\"border:none;direction:ltr;font-size:0;padding:16px 16px 16px 16px;text-align:left;\">\n" +
	              "<!--[if mso | IE]>\n" +
	              "<table role=\"presentation\" border=\"0\" cellpadding=\"0\" cellspacing=\"0\"><tr><td class=\"m-outlook c-outlook -outlook -outlook\" style=\"vertical-align:middle;width:282px;\">\n" +
	              "<![endif]--><div class=\"xc282 ogf m c\" style=\"font-size:0;text-align:left;direction:ltr;display:inline-block;vertical-align:middle;width:100%;\">\n" +
	              "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" width=\"100%\"><tbody><tr><td style=\"border:none;vertical-align:middle;padding:8px 8px 8px 8px;\">\n" +
	              "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style width=\"100%\"><tbody><tr><td align=\"center\" class=\"i fw-1\" style=\"font-size:0;padding:0;word-break:break-word;\">\n" +
	              "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style=\"border-collapse:collapse;border-spacing:0;\" class=\"fwm\"><tbody><tr><td style=\"width:266px;\" class=\"fwm\"> <img alt src=\"https://e.hypermatic.com/bf7fd04fb5eea939d5fda325b2a8d2d1.png\" style=\"border:0;display:block;outline:none;text-decoration:none;height:auto;width:100%;font-size:13px;\" title width=\"266\" height=\"auto\">\n" +
	              "</td></tr></tbody></table>\n" +
	              "</td></tr></tbody></table>\n" +
	              "</td></tr></tbody></table></div>\n" +
	              "<!--[if mso | IE]>\n" +
	              "</td><td class=\"g-outlook mb-16-outlook\" style=\"width:16px;\">\n" +
	              "<![endif]--><div class=\"xc16 ogf g mb-16\" style=\"font-size:0;text-align:left;direction:ltr;display:inline-block;width:100%;\">\n" +
	              "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" width=\"100%\"><tbody><tr><td style=\"padding:0;\">\n" +
	              "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style width=\"100%\"><tbody></tbody></table>\n" +
	              "</td></tr></tbody></table></div>\n" +
	              "<!--[if mso | IE]>\n" +
	              "</td><td class=\"c-outlook -outlook -outlook\" style=\"vertical-align:middle;width:282px;\">\n" +
	              "<![endif]--><div class=\"xc282 ogf c\" style=\"font-size:0;text-align:left;direction:ltr;display:inline-block;vertical-align:middle;width:100%;\">\n" +
	              "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" width=\"100%\"><tbody><tr><td style=\"border:none;vertical-align:middle;padding:8px 8px 8px 8px;\">\n" +
	              "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style width=\"100%\"><tbody><tr><td align=\"left\" class=\"x m\" style=\"font-size:0;padding-bottom:8px;word-break:break-word;\"><div style=\"text-align:left;\"><p style=\"Margin:0;text-align:left;mso-line-height-alt:38px;mso-ansi-font-size:32px;\"><span style=\"font-size:32px;font-family:'Inter','Arial',sans-serif;font-weight:700;color:#000000;line-height:116%;mso-line-height-alt:38px;mso-ansi-font-size:32px;\">Bom dia, "+nome+". Comece o dia com um poema!</span></p></div>\n" +
	              "</td></tr><tr><td align=\"left\" class=\"x m\" style=\"font-size:0;padding-bottom:8px;word-break:break-word;\"><div style=\"text-align:left;\"><p style=\"Margin:0;text-align:left;mso-line-height-alt:22px;mso-ansi-font-size:16px;\"><span style=\"font-size:16px;font-family:'Inter','Arial',sans-serif;font-weight:400;color:#777777;line-height:138%;mso-line-height-alt:22px;mso-ansi-font-size:16px;\">"+poema+"</span></p></div>\n" +
	              "</td></tr><tr><td class=\"s\" style=\"font-size:0;padding:0;padding-bottom:0;word-break:break-word;\" aria-hidden=\"true\"><div style=\"height:4px;line-height:4px;\">&#8202;</div>\n" +
	              "</td></tr></tbody></table>\n" +
	              "</td></tr></tbody></table></div>\n" +
	              "<!--[if mso | IE]>\n" +
	              "</td><td class=\"\" style=\"width:1px;\">\n" +
	              "<![endif]--><div class=\"xc1 ogf\" style=\"font-size:0;text-align:left;direction:ltr;display:inline-block;width:100%;\">\n" +
	              "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" width=\"100%\"><tbody><tr><td style=\"padding:0;\">\n" +
	              "<table border=\"0\" cellpadding=\"0\" cellspacing=\"0\" role=\"presentation\" style width=\"100%\"><tbody></tbody></table>\n" +
	              "</td></tr></tbody></table></div>\n" +
	              "<!--[if mso | IE]>\n" +
	              "</td></tr></table>\n" +
	              "<![endif]-->\n" +
	              "</td></tr></tbody></table></div>\n" +
	              "<!--[if mso | IE]>\n" +
	              "</td></tr></table>\n" +
	              "<![endif]--></div>\n" +
	              "</body>\n" +
	              "</html>";
		return html;
	}
	
}
